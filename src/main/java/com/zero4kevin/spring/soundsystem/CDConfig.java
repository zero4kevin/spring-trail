package com.zero4kevin.spring.soundsystem;

import com.zero4kevin.spring.soundsystem.interfaces.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xi1zhang on 2017/10/10.
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
