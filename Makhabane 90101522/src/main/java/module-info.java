module com.example.makhaban {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.makhaban to javafx.fxml;
    exports com.example.makhaban;
}