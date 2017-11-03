package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.interfaces.Instrument;
import org.springframework.stereotype.Component;

/**
 * Created by kevin on 10/15/17.
 */
@Component("guitar")
public class Guitar implements Instrument {
    public void play() {
        System.out.println("Strum strum strum");
    }

    public void tune() {

    }

    public void clean() {

    }
}
