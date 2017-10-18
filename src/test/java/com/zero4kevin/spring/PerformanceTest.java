package com.zero4kevin.spring;

import com.zero4kevin.spring.performance.Guitar;
import com.zero4kevin.spring.performance.InstrumentalistAutoWiring;
import com.zero4kevin.spring.performance.Piano;
import com.zero4kevin.spring.performance.exceptions.PerformanceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by kevin on 10/17/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:spring-annotationwiring.xml"})
@ContextConfiguration(locations={"file:src/main/java/com/zero4kevin/spring/spring-annotationwiring.xml"})
public class PerformanceTest {
    @Autowired
    Guitar guitar;

    @Autowired
    InstrumentalistAutoWiring instrumentalist;

    @Test
    public void GuitarNotNull(){
        assertNotNull(guitar);
    }

    @Test
    public  void InstrumentIsPiano() throws PerformanceException {
        instrumentalist.perform();
    }

}
