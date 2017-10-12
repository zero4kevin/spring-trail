package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Instrument;
import com.zero4kevin.spring.performance.interfaces.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


/**
 * Created by xi1zhang on 2017/10/11.
 */
public class InstrumentalistAutoWiring implements Performer {
    @Value("Jing Bell")
    private String song;

    @Autowired
    private Instrument instrument;

    @Autowired(required=false)
    private int age;

    public InstrumentalistAutoWiring(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    public InstrumentalistAutoWiring() {
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


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void tuneInstrument(){instrument.tune();}

    public void cleanInstrument(){instrument.clean();}
}
