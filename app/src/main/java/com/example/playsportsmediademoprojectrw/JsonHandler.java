package com.example.playsportsmediademoprojectrw;

import android.os.AsyncTask;
import android.util.Log;

import com.example.playsportsmediademoprojectrw.Model.YoutubeVideo;
import com.example.playsportsmediademoprojectrw.Model.YoutubeVideos;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonHandler {

    public static YoutubeVideos handleJsonFromAPI(final String requestURL) {

        Log.d("JsonHandler", "Entered handleJsonFromAPI with requestURL: " + requestURL);

/*
    This is messy and a much more elegant solution is probably possible but I'm conscious of the time
 */
        new AsyncTask<String, Void, YoutubeVideos>() {


            @Override
            protected YoutubeVideos doInBackground(String... strings) {
                HttpURLConnection connection = null;
                BufferedReader reader = null;

                try {
                    URL url = new URL(requestURL);

                    connection = (HttpURLConnection) url.openConnection();
                    connection.connect();

                    InputStream stream = connection.getInputStream();

                    reader = new BufferedReader(new InputStreamReader(stream));
                    StringBuilder buffer = new StringBuilder();

                    String line = "";

                    while ((line = reader.readLine()) != null) {
                        buffer.append(line);

                    }

                    Gson gson = new Gson();

                    final YoutubeVideos videos = gson.fromJson(buffer.toString(), YoutubeVideos.class); //don't like this much either

                    return videos;

                } catch (MalformedURLException e) {   //more could be done to inform the user of the issues
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    connection.disconnect();
                }
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;


            }

            @Override
            protected void onPostExecute(YoutubeVideos youtubeVideos) {
                super.onPostExecute(youtubeVideos);
            }
        };


    }
}
