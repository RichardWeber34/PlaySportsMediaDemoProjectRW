package com.example.playsportsmediademoprojectrw.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//This will be the data handed to the recyclerView to be displayed in the main activity

public class YoutubeVideos {


    @SerializedName("Items")
    private List<YoutubeVideo> youtubeVideoList;

    public List<YoutubeVideo> getYoutubeVideoList() {
        return youtubeVideoList;
    }

}
