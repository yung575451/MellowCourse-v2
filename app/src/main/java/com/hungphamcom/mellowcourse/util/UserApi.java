package com.hungphamcom.mellowcourse.util;

import android.app.Application;

public class UserApi extends Application {
    private String username;
    private String userId;
    private String status;
    private static UserApi instance;

    public static UserApi getInstance() {
        if (instance == null)
            instance = new UserApi();
        return instance;

    }

    public UserApi(){}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
