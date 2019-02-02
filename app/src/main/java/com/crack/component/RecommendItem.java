package com.crack.component;

import android.graphics.drawable.BitmapDrawable;

public class RecommendItem {
    private BitmapDrawable leftImgId;
    private String title;
    private String details;

    public RecommendItem(BitmapDrawable leftImgId, String title, String details) {
        this.leftImgId = leftImgId;
        this.title = title;
        this.details = details;
    }

    public BitmapDrawable getLeftImgId() {
        return leftImgId;
    }

    public void setLeftImgId(BitmapDrawable leftImgId) {
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
