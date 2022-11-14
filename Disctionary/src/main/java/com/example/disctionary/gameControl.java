package com.example.disctionary;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;

public class gameControl {
    wordDictionary DisctionaryList;
    @FXML
    TextField searchword;
    @FXML
    TextField word;
    @FXML
    TextField meaning;
    @FXML
    public void newWord(MouseEvent event) throws IOException{
        System.out.println("new Word added");
         DisctionaryList = new wordDictionary();
         DisctionaryList.deserialised();
         Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
         infoAlert.setHeaderText("New word adding");
      if (word.textProperty().get().equals("")|| meaning.textProperty().get().equals(""))
      {
          infoAlert.setContentText("Enter Some word/meaning to be added");
          infoAlert.showAndWait();
      }
      else {
          DisctionaryList.addword(word.textProperty().get(), meaning.textProperty().get());
          DisctionaryList.serialisedMap();
          infoAlert.setContentText("New word has added to dictionary");
          infoAlert.showAndWait();
      }
    }
    @FXML
    public void search(MouseEvent event) throws IOException{
        System.out.println("search the word");
        DisctionaryList = new wordDictionary();
        DisctionaryList.deserialised();
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setHeaderText("search result");
        if(searchword.textProperty().get().equals(""))
        {
            infoAlert.setContentText(DisctionaryList.getWordList().get("Please Enter word for srarch"));
            infoAlert.showAndWait();

        }
//        for (String i :DisctionaryList.getWordList().keySet())
//        {
//            System.out.println(i);
//        }

        if(DisctionaryList.getWordList().containsKey(searchword.textProperty().get())){
            System.out.println(DisctionaryList.getWordList().get(searchword.textProperty().get()));
            infoAlert.setContentText(DisctionaryList.getWordList().get(searchword.textProperty().get()));
            infoAlert.showAndWait();
        }
        else {
        infoAlert.setContentText("This word not in dictionary");
        infoAlert.showAndWait();
        }
        infoAlert.setContentText(DisctionaryList.getWordList().get(searchword.textProperty().get()));
        infoAlert.showAndWait();
    }
}
