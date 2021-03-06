package com.example.demo.model.service;

import com.example.demo.model.entity.BlogEntity;
import com.example.demo.model.entity.NewsEntity;
import com.example.demo.model.entity.UserEntity;

public class CommentServiceModel {
    private String comment;
    private BlogEntity blog;
    private UserEntity user;
    private NewsEntity news;

    public CommentServiceModel() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BlogEntity getBlog() {
        return blog;
    }

    public void setBlog(BlogEntity blog) {
        this.blog = blog;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public NewsEntity getNews() {
        return news;
    }

    public void setNews(NewsEntity news) {
        this.news = news;
    }
}
