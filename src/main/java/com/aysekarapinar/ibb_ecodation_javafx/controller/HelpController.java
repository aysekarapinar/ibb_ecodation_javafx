package com.aysekarapinar.ibb_ecodation_javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelpController {

    @FXML
    private TextArea helpTextArea;

    public void initialize() {
        // Yardım metni
        String helpText = "Bu uygulama grafikler oluşturmanıza yardımcı olur.\n\n" +
                "Pie Chart ve Line Chart'ları kullanarak verileri görselleştirebilirsiniz.";
        helpTextArea.setText(helpText);
    }
}
