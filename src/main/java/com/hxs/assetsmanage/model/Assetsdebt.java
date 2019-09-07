package com.hxs.assetsmanage.model;

import java.util.Date;

public class Assetsdebt {

    private Integer adid;
    private double adcmoney;
    private double adsmoney;
    private double adfmoney;
    private double admmoney;
    private double adtotal;
    private double total;
    private Date settime;
    private Date uptime;
    private String setpeople;
    private String uppeople;
    private Integer cid;
    //添加字段
    private String cname;

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

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public double getAdcmoney() {
        return adcmoney;
    }

    public void setAdcmoney(double adcmoney) {
        this.adcmoney = adcmoney;
    }

    public double getAdsmoney() {
        return adsmoney;
    }

    public void setAdsmoney(double adsmoney) {
        this.adsmoney = adsmoney;
    }

    public double getAdfmoney() {
        return adfmoney;
    }

    public void setAdfmoney(double adfmoney) {
        this.adfmoney = adfmoney;
    }

    public double getAdmmoney() {
        return admmoney;
    }

    public void setAdmmoney(double admmoney) {
        this.admmoney = admmoney;
    }

    public double getAdtotal() {
        return adtotal;
    }

    public void setAdtotal(double adtotal) {
        this.adtotal = adtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
