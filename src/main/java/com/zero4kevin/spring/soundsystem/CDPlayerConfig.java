package com.zero4kevin.spring.soundsystem;

import com.zero4kevin.spring.soundsystem.interfaces.CompactDisc;
import com.zero4kevin.spring.soundsystem.interfaces.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by xi1zhang on 2017/10/9.
 */
@Configuration
@Import(CDConfig.class)
//@ComponentScan(basePackageClasses = {CDPlayer.class, MediaPlayer.class})
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
