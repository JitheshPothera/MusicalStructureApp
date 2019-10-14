package com.study.potheraj.musicalstructureapp;

import java.io.Serializable;

/**
 * Songs represents the song object that user want to play
 * It contains the Song name, the album name and the song duration
 */
public class Songs implements Serializable {

    private String mSongName;
    private String mAlbumName;
    private Double mSongDuration;

    /**
     * Create a new Songs object
     * @param songName is the name of the song
     * @param albumName is the album name corresponding to the song
     * @param songDuration is the duration of the song
     */
    public Songs(String songName, String albumName, Double songDuration) {
        this.mSongName = songName;
        this.mAlbumName = albumName;
        this.mSongDuration = songDuration;
    }

    /**
     * Get the song name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Album name
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the song duration
     */
    public Double getSongDuration() {
        return mSongDuration;
    }
}
