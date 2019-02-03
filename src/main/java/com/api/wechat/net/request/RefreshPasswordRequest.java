package com.api.wechat.net.request;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/31
 * 包    名：com.api.wechat.net.request
 * 描    述：修改密码
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class RefreshPasswordRequest {
    private int userId;//用户id
    private String code;//短信验证码
    private String password;//密码

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
