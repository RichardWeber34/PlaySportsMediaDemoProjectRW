package com.example.playsportsmediademoprojectrw.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.playsportsmediademoprojectrw.Adapters.YoutubeVideoAdapter;
import com.example.playsportsmediademoprojectrw.Model.YoutubeVideos;
import com.example.playsportsmediademoprojectrw.R;

public class YoutubeVideoFragment extends Fragment {

    YoutubeVideos youtubeVideos;

    RecyclerView mRecyclerView;
    YoutubeVideoAdapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.videos_fragment_layout, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.videos_recyclerView);

        mAdapter = new YoutubeVideoAdapter();
        mRecyclerView.setAdapter(mAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        return view;
    }

    public void setData(YoutubeVideos videos){
        this.youtubeVideos = videos;
        mAdapter.setData(videos);

    }

}
