module com.example.disctionary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.disctionary to javafx.fxml;
    exports com.example.disctionary;
}