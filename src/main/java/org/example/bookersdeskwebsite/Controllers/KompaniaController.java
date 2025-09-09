package org.example.bookersdeskwebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KompaniaController {

    @GetMapping(value = {"about-us.html", "about-us-{lang}.html"})
    public ModelAndView aboutUs(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        System.out.println("po");
        modelAndView.setViewName("/kompania/rreth-nesh");
        return modelAndView;
    }

    // our team opens ekipi-yne
    @GetMapping(value = {"our-team.html", "our-team-{lang}.html"})
    public ModelAndView ourTeam(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/kompania/ekipi-yne");
        return modelAndView;
    }

    // careers opens karriera
    @GetMapping(value = {"careers.html", "careers-{lang}.html"})
    public ModelAndView careers(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/kompania/karriera");
        return modelAndView;
    }

    // clients opens klientet
    @GetMapping(value = {"klientet.html", "klientet-{lang}.html"})
    public ModelAndView clients(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/kompania/klientet");
        return modelAndView;
    }

    // contact opens kontakt
    @GetMapping(value = {"contact.html", "contact-{lang}.html"})
    public ModelAndView contact(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/kompania/kontakt");
        return modelAndView;
    }

    // sales opens shitjet
    @GetMapping(value = {"sales.html", "sales-{lang}.html"})
    public ModelAndView sales(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/kompania/shitjet");
        return modelAndView;
    }

    // reviews opens vleresime
    @GetMapping(value = {"reviews.html", "reviews-{lang}.html"})
    public ModelAndView reviews(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/kompania/vleresime");
        return modelAndView;
    }



}
