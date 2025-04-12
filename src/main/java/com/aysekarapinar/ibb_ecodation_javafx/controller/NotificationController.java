package com.aysekarapinar.ibb_ecodation_javafx.controller;

import dao.NotificationDAO;
import dto.NotificationDTO;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class NotificationListController {

    @FXML private TableView<NotificationDTO> notificationTable;
    @FXML private TableColumn<NotificationDTO, String> messageColumn;
    @FXML private TableColumn<NotificationDTO, String> typeColumn;
    @FXML private TableColumn<NotificationDTO, String> createdAtColumn;
    @FXML private Button deleteAllButton;

    private final NotificationDAO notificationDAO = new NotificationDAO();

    @FXML
    public void initialize() {
        messageColumn.setCellValueFactory(new PropertyValueFactory<>("message"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        createdAtColumn.setCellValueFactory(new PropertyValueFactory<>("createdAt"));

        loadNotifications();

        deleteAllButton.setOnAction(e -> {
            notificationDAO.deleteAll();
            loadNotifications();
        });
    }

    private void loadNotifications() {
        List<NotificationDTO> list = notificationDAO.findAll();
        notificationTable.getItems().setAll(list);
    }
}

