package com.api.wechat.net.request;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/31
 * 包    名：com.api.wechat.net.request
 * 描    述：登录
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class LoginRequest {
    private int type;//类型:0手机号登录,1嗡嗡号
    private String phone;//手机号-嗡嗡号
    private String password;//密码

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
