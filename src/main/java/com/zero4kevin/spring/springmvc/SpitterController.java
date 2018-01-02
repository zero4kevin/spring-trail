package com.zero4kevin.spring.springmvc;

import javax.validation.Valid;
import com.zero4kevin.spring.springmvc.domain.Spitter;
import com.zero4kevin.spring.springmvc.service.SpitterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.inject.Inject;


/**
 * Created by xi1zhang on 2017/12/26.
 */
@Controller
@RequestMapping(value="/spitters",method=RequestMethod.GET)
public class SpitterController {
    private SpitterService spitterService;

    @Inject
    public SpitterController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping("/spittles")
    public String listSpittlesForSpitters(@RequestParam("spitter") String username, Model model ){
        Spitter spitter=spitterService.getSpitter(username);
        model.addAttribute(spitter.getUsername());
        model.addAllAttributes(spitter.getSpittles());
        return "spittles/list";
    }

    @RequestMapping(method= RequestMethod.GET, params="new")
    public String createSpitterProfile(Model model){
        model.addAttribute(new Spitter());
        return "spitters/edit";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String addSpitterFromForm(@Valid Spitter spitter, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "spitters/edit";
        }
        spitterService.saveSpitter(spitter);
        return "redirect:/spitters/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model){
        model.addAttribute(spitterService.getSpitter(username));
        return "spittles/view";
    }

}
