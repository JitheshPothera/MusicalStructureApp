package com.study.potheraj.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Get the intent and the Song object passed as extra to the intent
        Intent intent = getIntent();
        Songs selectedSong = (Songs) intent.getSerializableExtra("SelectedSong");

        // Get the Song name text View
        TextView songName = (TextView) findViewById(R.id.song_name_text_view);
        //Set the selected song name as text to that view
        songName.setText(selectedSong.getSongName());

        // Get the Album name text View
        TextView albumName = (TextView) findViewById(R.id.album_name_text_view);
        //Set the selected album name as text to that view
        albumName.setText(selectedSong.getAlbumName());

        // Get the Song duration text View
        TextView songDuration = (TextView) findViewById(R.id.song_duration_text_view);
        //Set the selected song duration as text to that view
        songDuration.setText(selectedSong.getSongDuration().toString());
    }
}
