package com.tsui.fsp.vo;

public class IpUserVo {
    private String userid;

    private String username;

    private String userlogginname;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserlogginname() {
        return userlogginname;
    }

    public void setUserlogginname(String userlogginname) {
        this.userlogginname = userlogginname == null ? null : userlogginname.trim();
    }
}