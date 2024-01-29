package com.example.loginfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFXApplication extends Application {

    private Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setResizable(false);
        LoginFXController controller = LoginFXController.getInstance();
        controller.setStage(stage);
        controller.initialize();
    }

    public static void main(String[] args) {
        launch();
    }

}