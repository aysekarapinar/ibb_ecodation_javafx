package com.aysekarapinar.ibb_ecodation_javafx.utils;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileUtil {

    public static String chooseFileToSave(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Yedekleme Dosyasını Kaydet");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JSON Dosyası", "*.json"));
        File file = fileChooser.showSaveDialog(stage);
        return file != null ? file.getAbsolutePath() : null;
    }

    public static String chooseFileToLoad(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Yedek Dosyası Seç");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JSON Dosyası", "*.json"));
        File file = fileChooser.showOpenDialog(stage);
        return file != null ? file.getAbsolutePath() : null;
    }
}
