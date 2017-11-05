package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.interfaces.Thinker;

/**
 * Created by kevin on 11/5/17.
 */
public class Volunteer implements Thinker {
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts=thoughts;
    }

    public String getThoughts(){
        return thoughts;


    }
}
