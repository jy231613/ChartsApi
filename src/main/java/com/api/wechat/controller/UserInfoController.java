package com.api.wechat.controller;

import com.api.wechat.config.*;
import com.api.wechat.controller.norm.UserInfoControllerNorm;
import com.api.wechat.model.UserInfo;
import com.api.wechat.net.Results;
import com.api.wechat.net.request.*;
import com.api.wechat.service.UserService;
import com.api.wechat.util.Encryption;
import com.api.wechat.util.RedisUtils;
import com.api.wechat.util.StrUtil;
import com.api.wechat.util.Verify;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/18
 * 包    名：com.api.wechat.controller
 * 描    述：用户相关操作接口
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
@RestController
@RequestMapping("/*.u")
public class UserInfoController implements UserInfoControllerNorm {

    @Resource
    public UserService userService;

    @Resource
    public RedisUtils redis;

    @Override
    @RequestMapping("login")
    public String login(@RequestBody LoginRequest request){
        //加密字符串查询
        String passwordNew = Encryption.getEncryption().md5(request.getPassword());
        UserInfo info;
        if (request.getType()==0){
            //手机号登录
            info = userService.selectInfoByPhoneAndPassword(request.getPhone(), passwordNew);
        }else{
            //嗡嗡号登录
            info = userService.selectInfoByChartNAndPassword(request.getPhone(), passwordNew);
        }
        if (info==null){
            return Results.no(Codes.defeated_user_phone);
        }
        if (info.getStatus()< -1){
            return Results.no(Codes.defeated_user_status);
        }
        info.setPassword("");
        return Results.ok(info);
    }

    @Override
    @RequestMapping("logout")
    public String logout(@RequestBody IdRequest request){
        //用户退出等操作
        return Results.ok(Codes.success_ok.msg);
    }

    @Override
    @RequestMapping("register")
    public String registerPhone(@RequestBody RegisterRequest request){
        System.out.println(request.toString());
        //校验手机号是否可用
        if (!Verify.verifyPhone(request.getPhone())){
            return Results.no(Codes.defeated_phone_error);
        }
        if (userService.phoneIsHave(request.getPhone())){
            return Results.no(Codes.defeated_phone_have);
        }
        //进行用户初始化操作
        UserInfo info = newInfo(request.getPhone());
        info.setPassword(Encryption.getEncryption().md5(request.getPassword()));
        info.setUserpic(request.getUserPic()==null?"":request.getUserPic());
        info.setUsername(request.getNickname());
        System.out.println(info.toString());
        userService.addUserInfo(info);
        //保存信息并回传用户id
        return Results.ok(userService.selectInfoByPhone(request.getPhone()).getId());
    }

    @Override
    @RequestMapping("alterPassword")
    public String refreshPassword(RefreshPasswordRequest request) {
        UserInfo info = userService.selectInfoByUserId(request.getUserId());
        if (info==null){
            return Results.no(Codes.defeated_user_no);
        }
        //从缓存中取出短信验证码
        String requestCode = String.valueOf(redis.getValueFromHash(RedisHashDbConfig.REDIS_HASH_CONFIG_USER_MESSAGE_CODE,info.getPhone()));
        if (!request.getCode().equals(requestCode)){
            return Results.no(Codes.defeated_code_error);
        }
        //清理缓存的短信
        redis.delete(RedisHashDbConfig.REDIS_HASH_CONFIG_USER_MESSAGE_CODE,info.getPhone());
        //修改密码
        String passwordNew = Encryption.getEncryption().md5(request.getPassword());
        info.setPassword(passwordNew);
        info.setUpdatetime(new Date(System.currentTimeMillis()));
        userService.afreshUserInfo(info);
        return Results.ok(Codes.success_ok.msg);
    }

    @Override
    @RequestMapping("sendMessage")
    public String sendVerifyMessage(SendMessageRequest request) {
        UserInfo info = userService.selectInfoByUserId(request.getUserId());
        if (info==null){
            return Results.no(Codes.defeated_user_no);
        }
        if (info.getStatus()< -1){
            return Results.no(Codes.defeated_user_status);
        }
        //发送短信,并且存储到缓存中
        String codeMessage = StrUtil.getRandomString(Configs.configCodeMessageMax);
        System.out.println("短信验证码为:"+request.getPhone()+">>>"+codeMessage);
        //....
        redis.putToHash(
                RedisHashDbConfig.REDIS_HASH_CONFIG_USER_MESSAGE_CODE,
                request.getPhone(),
                codeMessage,
                Configs.configCodeMessageRedisMax
        );
        return Results.ok(Codes.success_ok.msg);
    }

    /**
     * 初始化一个默认用户
     * @param phone 手机号
     * @return 返回生成的这个新用户
     */
    private UserInfo newInfo(String phone){
        UserInfo newInfo = new UserInfo();
        newInfo.setPhone(phone);//绑定手机号
        newInfo.setUsername("用户"+phone.substring(7));//生成一个昵称
        newInfo.setChartn(StrUtil.getRandomString(Configs.userBaseNameMax)+phone);//生成18位随机的不重复字符最为默认的嗡嗡号
        newInfo.setUserpic("");//设置用户头像
        newInfo.setPassword(StrUtil.getUUID(true));//生成一个随机密码
        newInfo.setCirclepic("");//设置朋友圈顶部图片
        newInfo.setStatus(0);//初始化默认状态
        newInfo.setMans(-1);//性别未设置状态-1
        newInfo.setCountryn(0);//默认0--中国
        newInfo.setProvincen(0);//默认0
        newInfo.setCityn(0);//默认0
        newInfo.setRemake("(*￣︶￣)");//默认签名
        newInfo.setViplv(-1);//-1级vip
        newInfo.setCreatetime(new Date(System.currentTimeMillis()));//创建时间
        newInfo.setUpdatetime(new Date(System.currentTimeMillis()));//修改时间
        newInfo.setBannedtime(new Date(System.currentTimeMillis()));//账号到期时间
        return newInfo;
    }
}
