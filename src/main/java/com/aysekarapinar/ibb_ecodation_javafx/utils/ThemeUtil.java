package com.aysekarapinar.ibb_ecodation_javafx.utils;

import javafx.scene.Scene;

public class ThemeUtil {

    public static void applyTheme(Scene scene, String theme) {
        scene.getStylesheets().clear();
        scene.getStylesheets().add(ThemeUtil.class.getResource("/themes/" + theme + ".css").toExternalForm());
    }
}