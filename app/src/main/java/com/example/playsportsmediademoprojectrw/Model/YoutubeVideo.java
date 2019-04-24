package com.example.playsportsmediademoprojectrw.Model;

/*
This will be the model for youtube video objects to be deserialized using GSON formatter

 */

import com.example.playsportsmediademoprojectrw.Model.Thumbnails;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class YoutubeVideo {

    @SerializedName("publishedAt")
    Date publishedAt;

    @SerializedName("title")
    String title;

    @SerializedName("thumbnails")
    Thumbnails thumbnails;

    public Date getPublishedAt() {
        return publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }
}
