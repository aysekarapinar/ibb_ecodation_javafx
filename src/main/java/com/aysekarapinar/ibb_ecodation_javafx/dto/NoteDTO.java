package com.aysekarapinar.ibb_ecodation_javafx.dto;

import java.time.LocalDateTime;

public class NoteDTO {
    private int id;
    private String title;
    private String content;
    private LocalDateTime reminderTime;

    public NoteDTO() {}

    public NoteDTO(int id, String title, String content, LocalDateTime reminderTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.reminderTime = reminderTime;
    }

    public NoteDTO(String title, String content, LocalDateTime reminderTime) {
        this.title = title;
        this.content = content;
        this.reminderTime = reminderTime;
    }

    // Getter ve Setter'lar

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(LocalDateTime reminderTime) {
        this.reminderTime = reminderTime;
    }
}