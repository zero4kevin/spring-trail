package com.zero4kevin.spring.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by xi1zhang on 2017/10/10.
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
public class SoundSystemConfig {
}
