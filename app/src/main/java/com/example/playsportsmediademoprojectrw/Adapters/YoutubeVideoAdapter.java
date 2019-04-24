package com.example.playsportsmediademoprojectrw.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.playsportsmediademoprojectrw.Model.YoutubeVideo;
import com.example.playsportsmediademoprojectrw.Model.YoutubeVideos;
import com.example.playsportsmediademoprojectrw.R;

import java.util.List;

public class YoutubeVideoAdapter extends RecyclerView.Adapter {

    private List<YoutubeVideo> videos;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_row_item, viewGroup, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((VideoViewHolder) viewHolder).bindView(i);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView mThumbnailView;
        TextView mTitle;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);

            mThumbnailView = itemView.findViewById(R.id.video_thumbnail_imageView);
            mTitle = itemView.findViewById(R.id.video_title_textView);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            YoutubeVideo currentVideo = videos.get(position);

            mTitle.setText(currentVideo.getTitle());

            mThumbnailView.setImageBitmap(currentVideo.getThumbnails().getDefaultThumbnail().getThumbnailImage());

        }

        @Override
        public void onClick(View view) {
            //This is where I'd put a dialog with further information about the video and even a video player or something
        }
    }

    public void setData(YoutubeVideos videos){
        this.videos = videos.getYoutubeVideoList();
    }
}
