package com.acadview.instagram;

public class UserModel {
    String id,name,email,ImgUrl;

    public UserModel(String id, String name, String email, String imgUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        ImgUrl = imgUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }
}
