package org.example.bookersdeskwebsite.Service;

import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    public String getFlagClass(String language) {
        if (language == null) return "fi fi-us";

        switch (language) {
            case "sq": return "fi fi-al";       // Shqip
            case "en": return "fi fi-us";       // English US
            case "en_gb": return "fi fi-gb";    // English UK
            case "it": return "fi fi-it";       // Italiano
            case "tr": return "fi fi-tr";       // Türkçe
            case "fr": return "fi fi-fr";       // Français
            case "de": return "fi fi-de";       // Deutsch
            case "nl": return "fi fi-nl";       // Nederlands
            case "ro": return "fi fi-ro";       // Română
            case "bg": return "fi fi-bg";       // Български
            case "he": return "fi fi-il";       // עברית
            case "uk": return "fi fi-ua";       // Українська
            case "el": return "fi fi-gr";       // Ελληνικά
            case "pt": return "fi fi-pt";       // Português (PT)
            case "pt_br": return "fi fi-br";    // Português (BR)
            case "no": return "fi fi-no";       // Norsk
            case "fi": return "fi fi-fi";       // Suomi
            case "sv": return "fi fi-se";       // Svenska
            case "da": return "fi fi-dk";       // Dansk
            case "cs": return "fi fi-cz";       // Čeština
            case "hu": return "fi fi-hu";       // Magyar
            case "ja": return "fi fi-jp";       // 日本語
            case "ko": return "fi fi-kr";       // 한국어
            case "zh_cn": return "fi fi-cn";    // 简体中文
            case "zh_tw": return "fi fi-tw";    // 繁體中文
            case "sk": return "fi fi-sk";       // Slovenčina
            case "pl": return "fi fi-pl";       // Polski
            case "is": return "fi fi-is";       // Íslenska
            case "sr": return "fi fi-rs";       // Srpski
            case "id": return "fi fi-id";       // Bahasa Indonesia
            case "ms": return "fi fi-my";       // Bahasa Malaysia
            case "es": return "fi fi-es";       // Español
            case "es_ar": return "fi fi-ar";    // Español (AR)
            case "es_mx": return "fi fi-mx";    // Español (MX)
            case "ca": return "fi fi-ad";       // Català
            case "ar": return "fi fi-sa";       // العربية
            case "vi": return "fi fi-vn";       // Tiếng Việt
            case "th": return "fi fi-th";       // ภาษาไทย
            case "fil": return "fi fi-ph";      // Filipino
            case "hr": return "fi fi-hr";       // Hrvatski
            case "lt": return "fi fi-lt";       // Lietuvių
            case "lv": return "fi fi-lv";       // Latvian
            case "et": return "fi fi-ee";       // Eesti
            case "sl": return "fi fi-si";       // Slovenščina
            case "ru": return "fi fi-ru";       // Русский
            default: return "fi fi-us";         // fallback
        }

    }
}
