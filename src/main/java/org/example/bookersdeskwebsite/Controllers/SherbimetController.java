package org.example.bookersdeskwebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SherbimetController {


    @GetMapping(value = {"/booking-engine.html", "/booking-engine-{lang}.html"})
    public ModelAndView bookingEngine(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/booking-engine");
        return modelAndView;
    }

    @GetMapping(value = {"/business-website.html", "/business-website-{lang}.html"})
    public ModelAndView businessWebsite(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/business-website");
        return modelAndView;
    }

    @GetMapping(value = {"/channel-manager.html", "/channel-manager-{lang}.html"})
    public ModelAndView channelManager(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/channel-manager");
        return modelAndView;
    }

    @GetMapping(value = {"/pricing.html", "/pricing-{lang}.html"})
    public ModelAndView pricing(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/cmimet");
        return modelAndView;
    }

    @GetMapping(value = {"/hotel-marketing-solution.html", "/hotel-marketing-solution-{lang}.html"})
    public ModelAndView hotelMarketingSolution(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/hotel-marketing-solution");
        return modelAndView;
    }

    @GetMapping(value = {"/marketing.html", "/marketing-{lang}.html"})
    public ModelAndView marketing(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/marketing");
        return modelAndView;
    }

    @GetMapping(value = {"/pms-program-hoteli.html", "/pms-program-hoteli-{lang}.html"})
    public ModelAndView pmsProgramHoteli(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/pms-program-hoteli");
        return modelAndView;
    }

    @GetMapping(value = {"/revenue-management.html", "/revenue-management-{lang}.html"})
    public ModelAndView revenueManagement(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sherbimet/revenue-management");
        return modelAndView;
    }
}
