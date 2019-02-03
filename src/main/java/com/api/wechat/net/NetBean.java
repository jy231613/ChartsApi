package com.api.wechat.net;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/24
 * 包    名：com.api.wechat.net
 * 描    述：网络通信bean
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class NetBean<T> {
    private int code;
    private String msg;
    private T data;

    public NetBean() {
        super();
    }

    public NetBean(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public NetBean(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
