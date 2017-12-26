package com.zero4kevin.spring.springmvc;

import com.zero4kevin.spring.springmvc.service.SpitterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.xml.ws.RequestWrapper;
import java.util.HashMap;

/**
 * Created by kevin on 12/24/17.
 */
@Controller
@RequestMapping(value="/")
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE=25;

    private SpitterService spitterService;

    @Inject
    public HomeController(SpitterService spitterService){
        this.spitterService=spitterService;
    }

    @RequestMapping(value={"/","/home"})
    public String showHomePage(HashMap<String, Object> model){
        model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
        return "home";
    }

}
