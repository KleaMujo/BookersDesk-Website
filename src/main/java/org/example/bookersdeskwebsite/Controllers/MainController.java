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

    @GetMapping(value = {"index.html", "index-{lang}.html"})
    public ModelAndView index(
            ModelAndView modelAndView,
            @PathVariable(value = "lang", required = false) String lang) {

        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping(value = "/")
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
        modelAndView.setViewName("burimet/ndikimi-social");
        return modelAndView;
    }

    @GetMapping(value = {"/integration-category.html", "/integration-category-{lang}.html"})
    public ModelAndView integrationCategory(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/integration-category");
        return modelAndView;
    }

    @GetMapping(value = {"/pms-hotel-program.html", "/pms-hotel-program-{lang}.html"})
    public ModelAndView pmsHotelProgram(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("sherbimet/pms-program-hoteli");
        return modelAndView;
    }


    @GetMapping(value = {"/cookies-policy.html", "/cookies-policy-{lang}.html"})
    public ModelAndView cookiesPolicy(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/cookies-policy");
        return modelAndView;
    }

    @GetMapping(value = {"/data-security.html", "/data-security-{lang}.html"})
    public ModelAndView dataSecurity(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/data-security");
        return modelAndView;
    }

    @GetMapping(value = {"/privacy-policy.html", "/privacy-policy-{lang}.html"})
    public ModelAndView privacyPolicy(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/privacy-policy");
        return modelAndView;
    }

    @GetMapping(value = {"/terms-and-conditions.html", "/terms-and-conditions-{lang}.html"})
    public ModelAndView termsConditions(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/terms-and-conditions");
        return modelAndView;
    }

    @GetMapping(value = {"/sendEmail.html", "/sendEmail-{lang}.html"})
    public ModelAndView sendEmail(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/sendEmail");
        return modelAndView;
    }
}
