package com.example.loginfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLoginController {

    @FXML
    private Button logout;

    public void userLogOut(ActionEvent actionEvent) throws IOException {
        LoginFXApplication m = new LoginFXApplication();
        m.changeScene("hello-view.fxml");
    }
}
