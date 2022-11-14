package com.example.disctionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
   public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        root = new Group();
        game1 game = new game1();
        root.getChildren().add(game.root);


       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Word Dictionary");
        stage.setScene(new Scene(root,500,500));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}