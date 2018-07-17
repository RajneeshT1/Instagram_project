package com.acadview.instagram;

public class PostModel {

    String userName,userImgUrl,userEmail,postImgurl,postTime;

    public PostModel(String userName, String userImgUrl, String userEmail, String postImgurl, String postTime) {
        this.userName = userName;
        this.userImgUrl = userImgUrl;
        this.userEmail = userEmail;
        this.postImgurl = postImgurl;
        this.postTime = postTime;
    }

    public PostModel(){

    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPostImgurl() {
        return postImgurl;
    }

    public void setPostImgurl(String postImgurl) {
        this.postImgurl = postImgurl;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }
}
