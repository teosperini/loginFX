package com.example.loginfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFXController {

    private static LoginFXController instance;

    private Stage stage;
    private Scene scene;

    @FXML
    private Button button;

    @FXML
    private Button logout;

    @FXML
    private Label wrongLogIn;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Pane loginPane;

    @FXML
    private Pane afterLoginPane;


    public static LoginFXController getInstance() {
        if (instance == null) {
            instance = new LoginFXController();
        }
        return instance;
    }

    public void initialize() throws IOException {
        Parent node = genPane("hello-view.fxml");
        scene = new Scene(node, 600, 400);
        stage.setTitle("Sapienza");
        stage.setScene(scene);
        stage.show();
    }

    private Parent genPane(String s) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginFXApplication.class.getResource(s));
        fxmlLoader.setController(this);
        Parent node = fxmlLoader.load();
        node.setOnKeyPressed(keyEvent -> {

        });
        return node;
    }

    public void changeScene(String fxml) throws IOException{
        Parent pane = genPane(fxml);
        scene.setRoot(pane);
    }

    public void userLogOut(ActionEvent actionEvent) throws IOException {
        changeScene("hello-view.fxml");
    }

    private void checkLogin() throws IOException{
        LoginFXApplication m = new LoginFXApplication();
        if(username.getText().equals("matteo") && password.getText().equals("123")){
            wrongLogIn.setText("Success!");

            changeScene("afterLogin.fxml");

        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }
        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }



    public void setStage(Stage stage) {
        this.stage = stage;
    }
}