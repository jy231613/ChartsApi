package com.api.wechat.connect.socket.bean;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/19
 * 包    名：com.api.wechat.connect.socket.bean
 * 描    述：socket传播事件
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class SocketEvent {
    private int eventType;//事件类型
    private String eventMessage;//事件信息
    private int eventLv;//事件等级
    private String remake;//事件备注

    public int getEventLv() {
        return eventLv;
    }

    public void setEventLv(int eventLv) {
        this.eventLv = eventLv;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }
}
