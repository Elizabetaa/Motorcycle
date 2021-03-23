package com.example.demo.model.view;

import com.example.demo.model.entity.UserEntity;

import java.time.LocalDateTime;

public class NewsVieModel {
    private Long id;
    private String title;
    private String imageUrl;
    private LocalDateTime addedOn;

    public NewsVieModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDateTime addedOn) {
        this.addedOn = addedOn;
    }
}