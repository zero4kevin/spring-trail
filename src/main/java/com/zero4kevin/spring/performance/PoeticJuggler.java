package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Poem;

/**
 * Created by xi1zhang on 2017/10/11.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler() {
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
