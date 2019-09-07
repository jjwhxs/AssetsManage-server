package com.hxs.assetsmanage.model;

import java.util.Date;

public class Company {

    private Integer cid;
    private String cname;
    private String cuname;
    private String caddress;
    private String org;
    private double rigmoney;
    private String master;
    private Date settime;
    private Date uptime;
    private String setpeople;
    private String uppeople;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public double getRigmoney() {
        return rigmoney;
    }

    public void setRigmoney(double rigmoney) {
        this.rigmoney = rigmoney;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
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
