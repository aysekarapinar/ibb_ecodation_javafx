package com.aysekarapinar.ibb_ecodation_javafx.controller;

import com.aysekarapinar.ibb_ecodation_javafx.utils.LanguageUtil;
import com.aysekarapinar.ibb_ecodation_javafx.utils.ThemeUtil;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import util.LanguageUtil;
import util.ThemeUtil;

import java.util.Locale;

public class SettingsController {
    @FXML private ComboBox<String> languageCombo;
    @FXML private ToggleButton themeToggle;

    @FXML
    public void initialize() {
        languageCombo.getItems().addAll("Türkçe", "English");
        languageCombo.setOnAction(e -> {
            String selected = languageCombo.getValue();
            if (selected.equals("Türkçe")) {
                LanguageUtil.setLanguage(new Locale("tr", "TR"));
            } else {
                LanguageUtil.setLanguage(new Locale("en", "US"));
            }
        });

        themeToggle.setOnAction(e -> {
            Stage stage = (Stage) themeToggle.getScene().getWindow();
            Scene scene = stage.getScene();
            if (themeToggle.isSelected()) {
                ThemeUtil.applyTheme(scene, "dark-theme");
            } else {
                ThemeUtil.applyTheme(scene, "light-theme");
            }
        });
    }
}
