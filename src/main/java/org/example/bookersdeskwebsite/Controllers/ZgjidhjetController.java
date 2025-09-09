package org.example.bookersdeskwebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ZgjidhjetController {

    @GetMapping(value = {"/B&B-inns.html", "/B&B-inns-{lang}.html"})
    public ModelAndView bbInns(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/zgjidhjet/B&B-inns");
        return modelAndView;
    }

    @GetMapping(value = {"/hostels.html", "/hostels-{lang}.html"})
    public ModelAndView hostels(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/zgjidhjet/hostels");
        return modelAndView;
    }

    @GetMapping(value = {"/hotels.html", "/hotels-{lang}.html"})
    public ModelAndView hotele(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/zgjidhjet/hotele");
        return modelAndView;
    }

    @GetMapping(value = {"/partner-with-bookersdesk.html", "/partner-with-bookersdesk-{lang}.html"})
    public ModelAndView partnerWithBookersDesk(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/zgjidhjet/partner-with-bookersdesk");
        return modelAndView;
    }

    @GetMapping(value = {"/reseller.html", "/reseller-{lang}.html"})
    public ModelAndView reseller(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/zgjidhjet/reseller");
        return modelAndView;
    }


    @GetMapping(value = {"/vacation-rentals.html", "/vacation-rentals-{lang}.html"})
    public ModelAndView vacationRentals(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/zgjidhjet/vacation-rentals");
        return modelAndView;
    }
}

