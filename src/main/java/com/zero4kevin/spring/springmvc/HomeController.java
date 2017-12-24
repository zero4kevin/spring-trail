package com.zero4kevin.spring.springmvc;

import com.zero4kevin.spring.springmvc.service.SpitterService;
import org.springframework.stereotype.Controller;
import javax.inject.Inject;

/**
 * Created by kevin on 12/24/17.
 */
@Controller
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE=25;

    private SpitterService spitterService;

    @Inject
    public HomeController(SpitterService spitterService){
        this.spitterService=spitterService;;
    }

}
