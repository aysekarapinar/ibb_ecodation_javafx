package com.aysekarapinar.ibb_ecodation_javafx.service;

import com.aysekarapinar.ibb_ecodation_javafx.dao.NoteDAO;
import dao.NoteDAO;
import dto.NoteDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BackupService {

    private final NoteDAO noteDAO = new NoteDAO();

    public void backupToJson(String path) {
        List<NoteDTO> notes = noteDAO.findAll();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(notes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
