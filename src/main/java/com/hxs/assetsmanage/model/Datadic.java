package com.hxs.assetsmanage.model;

import java.util.Date;

public class Datadic{

    private Integer did;
    private String ditem;
    private String dtype;
    private Date settime;
    private Date uptime;
    private String setpeople;
    private String uppeople;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDitem() {
        return ditem;
    }

    public void setDitem(String ditem) {
        this.ditem = ditem;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
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
