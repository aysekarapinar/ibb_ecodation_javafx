package com.aysekarapinar.ibb_ecodation_javafx.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dao.NoteDAO;
import dto.NoteDTO;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class RestoreService {

    private final NoteDAO noteDAO = new NoteDAO();

    public void restoreFromJson(String path) {
        try (FileReader reader = new FileReader(path)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<NoteDTO>>() {}.getType();
            List<NoteDTO> notes = gson.fromJson(reader, listType);

            for (NoteDTO note : notes) {
                noteDAO.save(note);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
