package com.example.mychampion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


public class EventsFragment extends Fragment {

    private VideoView videoView;
    private MediaController mediaController;
    private String path;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events,container,false);
        videoView = view.findViewById(R.id.video);
        path = "android.resource://"+getActivity().getPackageName()+"/"+R.raw.galsen;
        mediaController = new MediaController(getActivity());
        videoView.setMediaController(mediaController);
        videoView.setVideoPath(path);
        videoView.start();

        return view;
    }
}