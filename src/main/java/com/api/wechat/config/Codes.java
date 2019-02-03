package com.api.wechat.config;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/25
 * 包    名：com.api.wechat.config
 * 描    述：
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public enum Codes {
    success(2000,"请求成功"),
    success_ok(2001,"成功"),
    defeated(4444,"服务器异常"),
    defeated_user_phone(4401,"用户名或密码错误"),
    defeated_user_status(4406,"账号异常,请前往安全中心查看具体事项"),
    defeated_phone_error(4402,"手机号格式有误"),
    defeated_phone_have(4403,"手机号已被注册"),
    defeated_user_no(4404,"用户不存在"),
    defeated_code_error(4405,"验证码有误");

    public int code;
    public String msg;

    Codes(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
