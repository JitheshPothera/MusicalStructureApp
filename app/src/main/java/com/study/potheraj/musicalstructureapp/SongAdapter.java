package com.study.potheraj.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Songs} objects.
 */
public class SongAdapter extends ArrayAdapter<Songs> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.song_item_list, parent, false);
        }

        // Get the Songs object located at this position in the list
        Songs currentSong = getItem(position);

        // Get the Song name text View
        TextView songTextView = (TextView) convertView.findViewById(R.id.song_text_view);
        //Set the song name as text to that view
        songTextView.setText(currentSong.getSongName());

        // Get the Album name text View
        TextView albumTextView = (TextView) convertView.findViewById(R.id.album_text_view);
        //Set the album name as text to that view
        albumTextView.setText(currentSong.getAlbumName());

        // Get the Song duration text View
        TextView durationTextView = (TextView) convertView.findViewById(R.id.duration_text_view);
        //Set the song duration as text to that view
        durationTextView.setText(currentSong.getSongDuration().toString());

        // Return the whole list item layout so that it can be shown in the ListView.
        return convertView;
    }

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Songs}s to be displayed.
     */
    public SongAdapter (Activity context, ArrayList<Songs> songs) {

        super(context, 0, songs);
    }
}
