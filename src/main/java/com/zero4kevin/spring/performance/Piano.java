package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.interfaces.Instrument;

/**
 * Created by kevin on 10/11/17.
 */
public class Piano implements Instrument {
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }

    public void tune() {

    }

    public void clean() {

    }
}
