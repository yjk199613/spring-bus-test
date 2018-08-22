/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.resplatform.admin.poolmanage.entity;

import java.util.Date;

/**
 * 用户表
 *
 * @author kehaiyong
 * @date 2018/7/6 16:14
 * @modified By kehaiyong
 * @since 1.0.0
 */
public class User {
    private Integer id;
    private String nickname;
    private String email;
    private String pswd;
    private Date create_time;
    private Date last_login_time;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

