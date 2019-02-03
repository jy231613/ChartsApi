package com.api.wechat.controller.norm;


import com.api.wechat.net.request.*;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/24
 * 包    名：com.api.wechat.controller
 * 描    述：用户相关操作接口规范
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public interface UserInfoControllerNorm {
    /**
     * 用户登录
     * @param request 请求体
     * @return 用户信息
     */
    String login(LoginRequest request);

    /**
     * 用户退出
     * @param request id请求
     * @return 不返回-->返回空字符
     */
    String logout(IdRequest request);

    /**
     * 用户手机号注册
     * @param request 请求体
     * @return 用户id
     */
    String registerPhone(RegisterRequest request);

    /**
     * 更改密码
     * @param request 请求体
     * @return 成功失败
     */
    String refreshPassword(RefreshPasswordRequest request);

    /**
     * 发送短信
     * @param request 请求体
     * @return 成功失败
     */
    String sendVerifyMessage(SendMessageRequest request);
}
