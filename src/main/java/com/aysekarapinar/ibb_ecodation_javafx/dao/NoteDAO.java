package com.aysekarapinar.ibb_ecodation_javafx.dao;

import config.DbConnection;
import dto.NoteDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO {

    public void save(NoteDTO note) {
        String sql = "INSERT INTO notes (title, content, reminder_time) VALUES (?, ?, ?)";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, note.getTitle());
            pstmt.setString(2, note.getContent());
            pstmt.setTimestamp(3, Timestamp.valueOf(note.getReminderTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<NoteDTO> findAll() {
        List<NoteDTO> notes = new ArrayList<>();
        String sql = "SELECT * FROM notes";

        try (Connection conn = DbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                NoteDTO note = new NoteDTO(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getTimestamp("reminder_time").toLocalDateTime()
                );
                notes.add(note);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return notes;
    }

    public void delete(int id) {
        String sql = "DELETE FROM notes WHERE id = ?";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(NoteDTO note) {
        String sql = "UPDATE notes SET title = ?, content = ?, reminder_time = ? WHERE id = ?";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, note.getTitle());
            pstmt.setString(2, note.getContent());
            pstmt.setTimestamp(3, Timestamp.valueOf(note.getReminderTime()));
            pstmt.setInt(4, note.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}