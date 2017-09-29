package com.cc.mblog.base;

import java.io.Serializable;

/**
 * Created by chenchao on 2017/9/21.
 */
public class BaseReq implements Serializable{

    private String token;
    private String userId;
    private String userName;
    private String password;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
