package com.zero4kevin.spring.performance;

import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import com.zero4kevin.spring.performance.interfaces.Instrument;
import com.zero4kevin.spring.performance.interfaces.Performer;

import java.util.Collection;
import java.util.Map;

/**
 * Created by kevin on 10/11/17.
 */
public class OneManBand implements Performer {
    private Collection<Instrument> instruments;
    private Map<String, Instrument> instrumentMap;

    public void perform() throws PerformanceException {
        for(Map.Entry<String, Instrument> entry: instrumentMap.entrySet()){
            System.out.print(entry.getKey() + " :");
            ((Instrument)entry.getValue()).play();
        }
//        for(Instrument instrument: instruments)
//            instrument.play();
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }
}
