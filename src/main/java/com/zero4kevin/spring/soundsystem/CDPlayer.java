package com.zero4kevin.spring.soundsystem;

import com.zero4kevin.spring.soundsystem.interfaces.CompactDisc;
import com.zero4kevin.spring.soundsystem.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xi1zhang on 2017/10/10.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void setCompactDisc(CompactDisc cd){
        this.cd=cd;
    }
    public void play() {
        cd.play();
    }
}
