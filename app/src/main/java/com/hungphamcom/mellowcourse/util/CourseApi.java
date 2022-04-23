package com.hungphamcom.mellowcourse.util;

import android.app.Application;

public class CourseApi extends Application {
    private String username;
    private String userId;
    private static CourseApi instance;

    public static CourseApi getInstance() {
        if (instance == null)
            instance = new CourseApi();
        return instance;

    }

    public CourseApi(){}


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
}
