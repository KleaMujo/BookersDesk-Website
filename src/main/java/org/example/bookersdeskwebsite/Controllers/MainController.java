package org.example.bookersdeskwebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
public class MainController {
    @PostMapping(value = "/changeLanguage")
    @ResponseBody
    public void changeLanguage(@RequestParam(value = "lang") String lang) {

        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setLocaleAttributeName(lang);
        System.out.println("Language changed to " + lang);
    }
    @GetMapping(value = {  "index.html", "index-{lang}.html" })
    public ModelAndView index(
            ModelAndView modelAndView,
            @PathVariable(value = "lang", required = false) String lang) {

        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping(value =  "/"  )
    public ModelAndView indexi(
            ModelAndView modelAndView,
            @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("redirect:/index.html");
        return modelAndView;
    }


    @GetMapping(value = {"/hotel-groups.html", "/hotel-groups-{lang}.html"})
    public ModelAndView hotelGroups(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/hotel-groups");
        return modelAndView;
    }

    @GetMapping(value = {"/social-impact.html", "/social-impact-{lang}.html"})
    public ModelAndView socialImpact(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/social-impact");
        return modelAndView;
    }

    @GetMapping(value = {"/integration-category.html", "/integration-category-{lang}.html"})
    public ModelAndView integrationCategory(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/integration-category");
        return modelAndView;
    }

    @GetMapping(value = {"/pms-hotel-program.html", "/pms-hotel-program-{lang}.html"})
    public ModelAndView pmsHotelProgram(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/pms-program-hoteli");
        return modelAndView;
    }

}
