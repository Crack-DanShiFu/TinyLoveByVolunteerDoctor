package com.crack.component;

public class RecommendItem {
    private int leftImgId;
    private String title;
    private String details;

    public RecommendItem(int leftImgId, String title, String details) {
        this.leftImgId = leftImgId;
        this.title = title;
        this.details = details;
    }

    public int getLeftImgId() {
        return leftImgId;
    }

    public void setLeftImgId(int leftImgId) {
        this.leftImgId = leftImgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
