package com.aysekarapinar.ibb_ecodation_javafx.utils;

import javafx.application.Platform;
import javafx.scene.control.Label;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class ClockUtil {

    public static void startClock(Label label) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        Timer timer = new Timer(true); // daemon timer
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    LocalDateTime now = LocalDateTime.now();
                    label.setText(now.format(formatter));
                });
            }
        }, 0, 1000);
    }
}
