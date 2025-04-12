package com.aysekarapinar.ibb_ecodation_javafx.controller;

import com.aysekarapinar.ibb_ecodation_javafx.dao.UserDAO;
import com.aysekarapinar.ibb_ecodation_javafx.dto.UserDTO;
import dao.UserDAO;
import dto.UserDTO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ProfileController {
    @FXML private Label usernameLabel;
    @FXML private TextField emailField;
    @FXML private PasswordField currentPasswordField;
    @FXML private PasswordField newPasswordField;

    private final UserDAO userDAO = new UserDAO();
    private UserDTO currentUser;

    public void setUser(UserDTO user) {
        this.currentUser = user;
        usernameLabel.setText(user.getEmail());
        emailField.setText(user.getEmail());
    }

    @FXML
    public void handleChangePassword() {
        String currentPassword = currentPasswordField.getText();
        String newPassword = newPasswordField.getText();

        if (userDAO.verifyUser(currentUser.getEmail(), currentPassword)) {
            userDAO.changePassword(currentUser.getEmail(), newPassword);
            showAlert("Şifre başarıyla değiştirildi.");
        } else {
            showAlert("Mevcut şifre yanlış.");
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bilgi");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
