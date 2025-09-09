package org.example.bookersdeskwebsite.config;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
public class PathLocaleResolver implements LocaleResolver {

    private final List<String> supportedLanguages = new ArrayList<>(Arrays.asList(
            "sq", "en_gb", "it", "tr", "fr", "en", "de", "nl", "ro", "bg", "he",
            "uk", "el", "pt", "pt_br", "no", "fi", "sv", "da", "cs", "hu", "ja",
            "ko", "zh_cn", "zh_tw", "sk", "pl", "is", "sr", "id", "ms", "es",
            "es_ar", "es_mx", "ca", "ar", "vi", "th", "fil", "hr", "lt", "lv", "et", "sl", "ru"
    ));

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String languageCode = uri.replaceAll(".*-(\\w{2,3}(?:[-_]\\w{2,3})?)\\.html.*", "$1");

        if (!supportedLanguages.contains(languageCode)) {
            return new Locale("sq"); // Default to sq
        }
        return new Locale(languageCode);
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }


}