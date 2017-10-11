package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Instrument;
import com.zero4kevin.spring.performance.interfaces.Performer;


/**
 * Created by xi1zhang on 2017/10/11.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;
    private int age;

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing "+ song + " : ");
        instrument.play();
    }

    public void setSong(String song){
        this.song=song;
    }

    public String getSong(){
        return song;
    }

    public void setInstrument(Instrument instrument){
        this.instrument=instrument;
    }

    public Instrument getInstrument(){
        return instrument;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void tuneInstrument(){instrument.tune();}

    public void cleanInstrument(){instrument.clean();}
}
