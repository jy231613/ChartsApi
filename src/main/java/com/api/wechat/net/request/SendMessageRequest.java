package com.api.wechat.net.request;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/31
 * 包    名：com.api.wechat.net.request
 * 描    述：发短信
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class SendMessageRequest {
    private int userId;//用户id
    private String phone;//手机号

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
