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

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing "+ song + " : ");
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

    public void tuneInstrument(){instrument.tune();}

    public void cleanInstrument(){instrument.clean();}
}
