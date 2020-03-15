package com.md2m.iVira.Models;

import com.google.gson.annotations.SerializedName;

public class Category {


    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("created_at")
    String createAt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
