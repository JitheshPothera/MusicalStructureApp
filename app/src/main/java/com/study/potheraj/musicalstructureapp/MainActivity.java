package com.study.potheraj.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the song_item_list.xmlt.xml layout file
        setContentView(R.layout.song_list);

        // Create an Array list of Songs object
        ArrayList<Songs> songs = new ArrayList<Songs>();

        // Add objects to the array
        songs.add(new Songs("Old Town Road (Remix)", "Lil Nas X", 5.09));
        songs.add(new Songs("Love Yourself", "Justin Bieber", 4.33));
        songs.add(new Songs("Say You Won't Let Go", "James Arthur", 3.31));
        songs.add(new Songs("I Feel It Coming", "The Weekend", 4.58));
        songs.add(new Songs("7 Years", "Lukas Graham", 4.00));
        songs.add(new Songs("Wild Thoughts (feat. Bryson Tiller & Rihanna", "DJ Khaled", 03.36));
        songs.add(new Songs("Love Me Now", "John Legend", 4.15));
        songs.add(new Songs("White Tiger", "Izzy Bizu", 2.56));
        songs.add(new Songs("Bad Bad News", "Leon Bridges", 6.06));
        songs.add(new Songs("Keep Your Head Down", "Jodie Abacus", 4.17));

        // Create a new custom array adapter whose data source is a list of Songs object
        // The adapter knows how to create list items for each item in the list.
        ArrayAdapter<Songs> songsListAdapter = new SongAdapter(this, songs);

        // Find the list view to set the adapter
        final ListView listView = (ListView) findViewById(R.id.list);

        // Set the adapter to the list view
        listView.setAdapter(songsListAdapter);

        //Set OnItemClickListener to the list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Identify the song object on the selected position
                Songs selectedSong = (Songs) listView.getItemAtPosition(i);

                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // Add the Object as an extra to the intent
                nowPlayingIntent.putExtra("SelectedSong", selectedSong);
                // Start the activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
