package com.api.wechat.model;

import java.util.Date;

public class UserRelation {
    private Integer id;

    private Integer comeid;

    private Integer headforid;

    private Integer status;

    private Date happentime;

    private String comename;

    private String headforname;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComeid() {
        return comeid;
    }

    public void setComeid(Integer comeid) {
        this.comeid = comeid;
    }

    public Integer getHeadforid() {
        return headforid;
    }

    public void setHeadforid(Integer headforid) {
        this.headforid = headforid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHappentime() {
        return happentime;
    }

    public void setHappentime(Date happentime) {
        this.happentime = happentime;
    }

    public String getComename() {
        return comename;
    }

    public void setComename(String comename) {
        this.comename = comename == null ? null : comename.trim();
    }

    public String getHeadforname() {
        return headforname;
    }

    public void setHeadforname(String headforname) {
        this.headforname = headforname == null ? null : headforname.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}