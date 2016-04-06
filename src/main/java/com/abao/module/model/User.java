package com.abao.module.model;

import java.util.Date;

public class User {
    private String uid;

    private String account;

    private String password;

    private Integer activated;

    private String verifycode;

    private Date applytime;

    private Date enabledtime;

    private Integer vcNumber;

    private Date passwordModifyTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getEnabledtime() {
        return enabledtime;
    }

    public void setEnabledtime(Date enabledtime) {
        this.enabledtime = enabledtime;
    }

    public Integer getVcNumber() {
        return vcNumber;
    }

    public void setVcNumber(Integer vcNumber) {
        this.vcNumber = vcNumber;
    }

    public Date getPasswordModifyTime() {
        return passwordModifyTime;
    }

    public void setPasswordModifyTime(Date passwordModifyTime) {
        this.passwordModifyTime = passwordModifyTime;
    }
}