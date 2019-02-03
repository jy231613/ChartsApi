package com.api.wechat.model;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private String username;

    private String userpic;

    private String chartn;

    private Integer mans;

    private String password;

    private String phone;

    private String withqq;

    private String withemail;

    private Integer countryn;

    private Integer provincen;

    private Integer cityn;

    private String remake;

    private String circlepic;

    private Integer status;

    private Integer viplv;

    private Date createtime;

    private Date updatetime;

    private Date bannedtime;

    private String standby;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic == null ? null : userpic.trim();
    }

    public String getChartn() {
        return chartn;
    }

    public void setChartn(String chartn) {
        this.chartn = chartn == null ? null : chartn.trim();
    }

    public Integer getMans() {
        return mans;
    }

    public void setMans(Integer mans) {
        this.mans = mans;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWithqq() {
        return withqq;
    }

    public void setWithqq(String withqq) {
        this.withqq = withqq == null ? null : withqq.trim();
    }

    public String getWithemail() {
        return withemail;
    }

    public void setWithemail(String withemail) {
        this.withemail = withemail == null ? null : withemail.trim();
    }

    public Integer getCountryn() {
        return countryn;
    }

    public void setCountryn(Integer countryn) {
        this.countryn = countryn;
    }

    public Integer getProvincen() {
        return provincen;
    }

    public void setProvincen(Integer provincen) {
        this.provincen = provincen;
    }

    public Integer getCityn() {
        return cityn;
    }

    public void setCityn(Integer cityn) {
        this.cityn = cityn;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public String getCirclepic() {
        return circlepic;
    }

    public void setCirclepic(String circlepic) {
        this.circlepic = circlepic == null ? null : circlepic.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getViplv() {
        return viplv;
    }

    public void setViplv(Integer viplv) {
        this.viplv = viplv;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getBannedtime() {
        return bannedtime;
    }

    public void setBannedtime(Date bannedtime) {
        this.bannedtime = bannedtime;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby == null ? null : standby.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpic='" + userpic + '\'' +
                ", chartn='" + chartn + '\'' +
                ", mans=" + mans +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", withqq='" + withqq + '\'' +
                ", withemail='" + withemail + '\'' +
                ", countryn=" + countryn +
                ", provincen=" + provincen +
                ", cityn=" + cityn +
                ", remake='" + remake + '\'' +
                ", circlepic='" + circlepic + '\'' +
                ", status=" + status +
                ", viplv=" + viplv +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", bannedtime=" + bannedtime +
                ", standby='" + standby + '\'' +
                '}';
    }
}