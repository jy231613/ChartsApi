package com.api.wechat.model;

import java.util.Date;

public class DynamicComment {
    private Integer id;

    private Integer withuser;

    private Integer withdynamic;

    private Integer withcomment;

    private String commenttext;

    private Date commenttime;

    private Integer status;

    private Integer privatecomment;

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

    public Integer getWithdynamic() {
        return withdynamic;
    }

    public void setWithdynamic(Integer withdynamic) {
        this.withdynamic = withdynamic;
    }

    public Integer getWithcomment() {
        return withcomment;
    }

    public void setWithcomment(Integer withcomment) {
        this.withcomment = withcomment;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext == null ? null : commenttext.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPrivatecomment() {
        return privatecomment;
    }

    public void setPrivatecomment(Integer privatecomment) {
        this.privatecomment = privatecomment;
    }
}