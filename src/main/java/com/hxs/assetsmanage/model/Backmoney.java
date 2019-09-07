package com.hxs.assetsmanage.model;

import java.util.Date;

public class Backmoney {

    private Integer baid;
    private double bamoney;
    private Date batime;
    private String bastatus;
    private double bomoney;
    private Date settime;
    private Date uptime;
    private String setpeople;
    private String uppeople;

    public Integer getBaid() {
        return baid;
    }

    public void setBaid(Integer baid) {
        this.baid = baid;
    }

    public double getBamoney() {
        return bamoney;
    }

    public void setBamoney(double bamoney) {
        this.bamoney = bamoney;
    }

    public Date getBatime() {
        return batime;
    }

    public void setBatime(Date batime) {
        this.batime = batime;
    }

    public String getBastatus() {
        return bastatus;
    }

    public void setBastatus(String bastatus) {
        this.bastatus = bastatus;
    }

    public double getBomoney() {
        return bomoney;
    }

    public void setBomoney(double bomoney) {
        this.bomoney = bomoney;
    }

    public Date getSettime() {
        return settime;
    }

    public void setSettime(Date settime) {
        this.settime = settime;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getSetpeople() {
        return setpeople;
    }

    public void setSetpeople(String setpeople) {
        this.setpeople = setpeople;
    }

    public String getUppeople() {
        return uppeople;
    }

    public void setUppeople(String uppeople) {
        this.uppeople = uppeople;
    }
}
