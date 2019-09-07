package com.hxs.assetsmanage.model;

import java.util.Date;

public class Borrowmoney {

    private Integer bid;
    private Integer cid;
    private double bmoney;
    private Date bstime;
    private Date betime;
    private Integer status;
    private double bprofit;
    private Date settime;
    private Date uptime;
    private String setpeople;
    private String uppeople;
    private String gcompany;
    //添加公司名称字段
    private String cname;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public double getBmoney() {
        return bmoney;
    }

    public void setBmoney(double bmoney) {
        this.bmoney = bmoney;
    }

    public Date getBstime() {
        return bstime;
    }

    public void setBstime(Date bstime) {
        this.bstime = bstime;
    }

    public Date getBetime() {
        return betime;
    }

    public void setBetime(Date betime) {
        this.betime = betime;
    }

    public double getBprofit() {
        return bprofit;
    }

    public void setBprofit(double bprofit) {
        this.bprofit = bprofit;
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

    public String getGcompany() {
        return gcompany;
    }

    public void setGcompany(String gcompany) {
        this.gcompany = gcompany;
    }

}
