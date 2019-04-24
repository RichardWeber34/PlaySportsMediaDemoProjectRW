package com.example.playsportsmediademoprojectrw.Model;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("url")
    String url;

    @SerializedName("width")
    int width;

    @SerializedName("height")
    int height;

    Bitmap thumbnailImage;

    private void convertToBitmap(){
        /*
        some proccessing needs to be done here to get the image binary from the URL and convert it to a bitmap to be handed to the list items in the adapter
         */

        //this.thumbnailImage = bitmap
    }

    public String getUrl() {
        return url;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Bitmap getThumbnailImage() {
        return thumbnailImage;
    }
}
