package com.zero4kevin.spring;

import static org.junit.Assert.*;

import com.zero4kevin.spring.soundsystem.CDPlayerConfig;
import com.zero4kevin.spring.soundsystem.interfaces.CompactDisc;
import com.zero4kevin.spring.soundsystem.interfaces.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xi1zhang on 2017/10/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule log= new SystemOutRule().enableLog();
    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play(){
       player.play();
       assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
               " by The Beatles\n",log.getLog());
    }
}
