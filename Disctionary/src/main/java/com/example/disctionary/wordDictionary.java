package com.example.disctionary;

import java.io.*;
import java.util.HashMap;

public class wordDictionary {
    HashMap<String,String> wordList;
    wordDictionary()
    {
        this.wordList = new HashMap<>();
    }
    void addword(String word , String meaning){
        wordList.put(word,meaning);
    }
    HashMap<String,String> getWordList(){
        return wordList;
    }
    void serialisedMap() {
        try {
            FileOutputStream os = new FileOutputStream("wordList2");
            ObjectOutputStream oss = new ObjectOutputStream(os);

            oss.writeObject(wordList);
            oss.close();
            os.close();
        } catch (IOException io)
        {
            io.printStackTrace();
        }
    }
    void deserialised()
    {
        try {
            FileInputStream is = new FileInputStream("wordList2");
            ObjectInputStream ois = new ObjectInputStream(is);

            wordList = (HashMap<String, String>) ois.readObject();
        }
    catch (IOException io)
    {
        io.printStackTrace();
    }
    catch(ClassNotFoundException ex){
        System.out.println("Class Not found");
    }

}
}
