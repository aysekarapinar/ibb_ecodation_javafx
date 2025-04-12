package com.aysekarapinar.ibb_ecodation_javafx.controller;

import com.aysekarapinar.ibb_ecodation_javafx.dao.NoteDAO;
import com.aysekarapinar.ibb_ecodation_javafx.dto.NoteDTO;
import dao.NoteDAO;
import dto.NoteDTO;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class NoteController {

    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private DatePicker datePicker;
    @FXML private TextField timeField; // Format: HH:mm
    @FXML private TableView<NoteDTO> noteTable;

    private final NoteDAO noteDAO = new NoteDAO();

    @FXML
    public void initialize() {
        loadNotes();
    }

    @FXML
    public void handleAddNote() {
        String title = titleField.getText();
        String content = contentArea.getText();
        LocalDate date = datePicker.getValue();
        String time = timeField.getText();

        if (title.isEmpty() || content.isEmpty() || date == null || time.isEmpty()) {
            showAlert("Lütfen tüm alanları doldurun.");
            return;
        }

        LocalTime parsedTime = LocalTime.parse(time);
        LocalDateTime reminder = LocalDateTime.of(date, parsedTime);

        NoteDTO note = new NoteDTO(title, content, reminder);
        noteDAO.save(note);

        scheduleReminder(note);
        showAlert("Not eklendi.");
        clearFields();
        loadNotes();
    }

    private void loadNotes() {
        List<NoteDTO> notes = noteDAO.findAll();
        noteTable.getItems().setAll(notes);
    }

    private void scheduleReminder(NoteDTO note) {
        long delay = java.time.Duration.between(LocalDateTime.now(), note.getReminderTime()).toMillis();
        if (delay < 0) return;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() ->
                        showAlert("⏰ Hatırlatma: " + note.getTitle() + "\n\n" + note.getContent()));
            }
        }, delay);
    }

    private void clearFields() {
        titleField.clear();
        contentArea.clear();
        timeField.clear();
        datePicker.setValue(null);
    }

    private void showAlert(String mesaj) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bilgi");
        alert.setHeaderText(null);
        alert.setContentText(mesaj);
        alert.showAndWait();
    }
}