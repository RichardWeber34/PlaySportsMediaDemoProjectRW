package com.example.playsportsmediademoprojectrw.Model;

import com.google.gson.annotations.SerializedName;

/*
I'm only going to use the default thumbnail, but we could deserialize all the thumbnails here if we wanted
 */

public class Thumbnails {



    @SerializedName("default")
    Thumbnail defaultThumbnail;

    public Thumbnail getDefaultThumbnail() {
        return defaultThumbnail;
    }
}
