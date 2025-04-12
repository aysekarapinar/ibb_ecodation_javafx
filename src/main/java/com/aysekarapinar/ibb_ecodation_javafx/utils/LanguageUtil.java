package com.aysekarapinar.ibb_ecodation_javafx.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageUtil {

    private static ResourceBundle bundle;

    public static void setLanguage(Locale locale) {
        bundle = ResourceBundle.getBundle("i18n.Messages", locale);
    }

    public static ResourceBundle getBundle() {
        return bundle;
    }
}