package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.interfaces.MindReader;

/**
 * Created by kevin on 11/5/17.
 */
public class Magician implements MindReader {
    private String thoughts;
    
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts=thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
