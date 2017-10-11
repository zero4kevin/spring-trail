package com.zero4kevin.spring.soundsystem;

import com.zero4kevin.spring.soundsystem.interfaces.CompactDisc;

import java.util.List;

/**
 * Created by xi1zhang on 2017/10/10.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks)
            System.out.println("-Track: " + track);

    }
}
