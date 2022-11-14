package com.example.disctionary;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class game1 {
    public AnchorPane root;
      game1() throws IOException{
          root = FXMLLoader.load(getClass().getResource("game.fxml"));
    }
}
