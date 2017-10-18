package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Instrument;
import com.zero4kevin.spring.performance.interfaces.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Created by xi1zhang on 2017/10/11.
 */
@Component("eddie")
public class InstrumentalistAutoWiring implements Performer {
    private String song;

    private Instrument instrument;

    private int age;

    public InstrumentalistAutoWiring(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
        this.age=18;
    }


    public InstrumentalistAutoWiring() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing "+ song + " : ");
        instrument.play();
    }

    @Value("little stars")
    public void setSong(String song){
        this.song=song;
    }

    public String getSong(){
        return song;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void tuneInstrument(){instrument.tune();}

    public void cleanInstrument(){instrument.clean();}

    @Autowired
    @Qualifier("piano")
    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
