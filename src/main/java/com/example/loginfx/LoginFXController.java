package com.example.loginfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginFXController {
    public LoginFXController(){

    }
    @FXML
    private Button button;

    @FXML
    private Label wrongLogIn;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    public void userLogIn(ActionEvent e) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException{
        LoginFXApplication m = new LoginFXApplication();
        if(username.getText().toString().equals("matteo") && password.getText().toString().equals("123")){
            wrongLogIn.setText("Success!");

            m.changeScene("afterLogin.fxml");

        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }
        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }

}