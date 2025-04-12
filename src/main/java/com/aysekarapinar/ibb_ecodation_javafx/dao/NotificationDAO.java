package com.aysekarapinar.ibb_ecodation_javafx.dao;

import config.DbConnection;
import dto.NotificationDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NotificationDAO {

    public void save(NotificationDTO notification) {
        String sql = "INSERT INTO notifications (message, type, created_at) VALUES (?, ?, ?)";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, notification.getMessage());
            pstmt.setString(2, notification.getType());
            pstmt.setTimestamp(3, Timestamp.valueOf(notification.getCreatedAt()));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<NotificationDTO> findAll() {
        List<NotificationDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM notifications ORDER BY created_at DESC";

        try (Connection conn = DbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                NotificationDTO notification = new NotificationDTO(
                        rs.getInt("id"),
                        rs.getString("message"),
                        rs.getString("type"),
                        rs.getTimestamp("created_at").toLocalDateTime()
                );
                list.add(notification);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void deleteAll() {
        String sql = "DELETE FROM notifications";
        try (Connection conn = DbConnection.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
