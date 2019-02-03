package com.api.wechat.net.request;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/31
 * 包    名：com.api.wechat.net.request
 * 描    述：注册请求封装体
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class RegisterRequest {
    private String phone;//手机号
    private String password;//密码
    private String nickname;//昵称
    private String userPic;//用户头像地址

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }
}
