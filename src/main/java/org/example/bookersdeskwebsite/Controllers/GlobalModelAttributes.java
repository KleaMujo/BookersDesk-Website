package org.example.bookersdeskwebsite.Controllers;

import org.example.bookersdeskwebsite.Service.LanguageService;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Locale;

@ControllerAdvice
public class GlobalModelAttributes {

    private final LanguageService languageService;

    public GlobalModelAttributes(LanguageService languageService) {
        this.languageService = languageService;
    }

    @ModelAttribute("flagClass")
    public String addFlagClass(Locale locale) {
        return languageService.getFlagClass(locale.getLanguage());
    }
}

