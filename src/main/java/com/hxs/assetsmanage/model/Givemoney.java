package com.hxs.assetsmanage.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Givemoney {

    private Integer gid;
    private double gmoney;
    private Integer preday;
    private double crimoney;
    private Date gtime;
    private Date settime;
    private Date uptime;
    private String setpeople;
    private String uppeople;
    private Integer cid;

    private Integer gstatus;
    //添加字段
    private String cname;
    private Integer bid;
    private double bmoney;
    private Date bstime;
    private Date betime;

    public Integer getGstatus() {
        return gstatus;
    }

    public void setGstatus(Integer gstatus) {
        this.gstatus = gstatus;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public double getBprofit() {
        return bprofit;
    }

    public void setBprofit(double bprofit) {
        this.bprofit = bprofit;
    }

    private Integer status;
    private double bprofit;

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

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public double getGmoney() {
        return gmoney;
    }

    public void setGmoney(double gmoney) {
        this.gmoney = gmoney;
    }

    public Integer getPreday() {
        return preday;
    }

    public void setPreday(Integer preday) {
        this.preday = preday;
    }

    public double getCrimoney() {
        return crimoney;
    }

    public void setCrimoney(double crimoney) {
        this.crimoney = crimoney;
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
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
