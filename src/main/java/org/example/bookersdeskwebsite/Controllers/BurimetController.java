package org.example.bookersdeskwebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BurimetController {


    @GetMapping(value = {"all-resources.html", "all-resources-{lang}.html"})
    public ModelAndView allResources(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/all-resources");
        return modelAndView;
    }


    @GetMapping(value = {"tools.html", "tools-{lang}.html"})
    public ModelAndView tools(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/tools");
        return modelAndView;
    }


    @GetMapping(value = {"reservations-distribution.html", "reservations-distribution-{lang}.html"})
    public ModelAndView reservationsDistribution(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/reservations-distribution");
        return modelAndView;
    }


    @GetMapping(value = {"guest-management.html", "guest-management-{lang}.html"})
    public ModelAndView guestManagement(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/guest-management");
        return modelAndView;
    }


    @GetMapping(value = {"industry-trends.html", "industry-trends-{lang}.html"})
    public ModelAndView industryTrends(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/industry-trends");
        return modelAndView;
    }


    @GetMapping(value = {"ndikimi-social.html", "ndikimi-social-{lang}.html"})
    public ModelAndView socialImpact(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/ndikimi-social");
        return modelAndView;
    }


    @GetMapping(value = {"updates.html", "updates-{lang}.html"})
    public ModelAndView updates(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/updates");
        return modelAndView;
    }


    @GetMapping(value = {"reports.html", "reports-{lang}.html"})
    public ModelAndView reports(ModelAndView modelAndView, @PathVariable(value = "lang", required = false) String lang) {
        modelAndView.setViewName("/burimet/reports");
        return modelAndView;
    }
}
