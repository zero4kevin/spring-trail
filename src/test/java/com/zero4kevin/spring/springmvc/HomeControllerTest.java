package com.zero4kevin.spring.springmvc;

import com.zero4kevin.spring.springmvc.domain.Spittle;
import com.zero4kevin.spring.springmvc.service.SpitterService;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;
/**
 * Created by kevin on 12/24/17.
 */
public class HomeControllerTest {
    private static int DEFAULT_SPITTLES_PER_PAGE=25;
    @Test
    public void shouldDisplayRecentSpittles(){

        List<Spittle> expectedSpittles=asList(new Spittle(), new Spittle(), new Spittle());

        SpitterService spitterService =mock(SpitterService);

        when(spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));

    }
}
