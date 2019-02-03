package com.api.wechat.model;

import java.util.Date;

public class UserDynamic {
    private Integer id;

    private Integer withuser;

    private String dynamictext;

    private String dynamicpic;

    private String dynamicvideo;

    private String dynamicevent;

    private Date pushtime;

    private Integer status;

    private Integer dynamictype;

    private Date updatetime;

    private String dynamiclink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWithuser() {
        return withuser;
    }

    public void setWithuser(Integer withuser) {
        this.withuser = withuser;
    }

    public String getDynamictext() {
        return dynamictext;
    }

    public void setDynamictext(String dynamictext) {
        this.dynamictext = dynamictext == null ? null : dynamictext.trim();
    }

    public String getDynamicpic() {
        return dynamicpic;
    }

    public void setDynamicpic(String dynamicpic) {
        this.dynamicpic = dynamicpic == null ? null : dynamicpic.trim();
    }

    public String getDynamicvideo() {
        return dynamicvideo;
    }

    public void setDynamicvideo(String dynamicvideo) {
        this.dynamicvideo = dynamicvideo == null ? null : dynamicvideo.trim();
    }

    public String getDynamicevent() {
        return dynamicevent;
    }

    public void setDynamicevent(String dynamicevent) {
        this.dynamicevent = dynamicevent == null ? null : dynamicevent.trim();
    }

    public Date getPushtime() {
        return pushtime;
    }

    public void setPushtime(Date pushtime) {
        this.pushtime = pushtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDynamictype() {
        return dynamictype;
    }

    public void setDynamictype(Integer dynamictype) {
        this.dynamictype = dynamictype;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDynamiclink() {
        return dynamiclink;
    }

    public void setDynamiclink(String dynamiclink) {
        this.dynamiclink = dynamiclink == null ? null : dynamiclink.trim();
    }
}