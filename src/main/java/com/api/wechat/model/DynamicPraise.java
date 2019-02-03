package com.api.wechat.model;

import java.util.Date;

public class DynamicPraise {
    private Integer id;

    private Integer withdynamic;

    private Integer withuser;

    private Date praisetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWithdynamic() {
        return withdynamic;
    }

    public void setWithdynamic(Integer withdynamic) {
        this.withdynamic = withdynamic;
    }

    public Integer getWithuser() {
        return withuser;
    }

    public void setWithuser(Integer withuser) {
        this.withuser = withuser;
    }

    public Date getPraisetime() {
        return praisetime;
    }

    public void setPraisetime(Date praisetime) {
        this.praisetime = praisetime;
    }
}