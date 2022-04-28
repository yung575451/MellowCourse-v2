package com.hungphamcom.mellowcourse.model;

import com.google.firebase.Timestamp;

public class Item {
    private String name;
    private int price;
    private String description;
    private String imageUrl;
    private String UserId;
    private Timestamp timeAdded;
    private String username;

    public Item(String name, int price, String description, String imageUrl, String userId, Timestamp timeAdded, String username) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
        UserId = userId;
        this.timeAdded = timeAdded;
        this.username = username;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public Timestamp getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Timestamp timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
