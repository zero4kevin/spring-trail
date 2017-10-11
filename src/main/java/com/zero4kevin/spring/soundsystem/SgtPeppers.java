package com.zero4kevin.spring.soundsystem;

import com.zero4kevin.spring.soundsystem.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by xi1zhang on 2017/10/9.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
