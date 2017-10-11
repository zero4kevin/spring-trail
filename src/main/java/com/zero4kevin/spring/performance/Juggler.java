package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Performer;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class Juggler implements Performer {
    private int beanBags=3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("Juggling "+ beanBags + " Beanbags");
    }
}
