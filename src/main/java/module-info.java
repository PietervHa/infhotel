module com.example.codeclass {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.internal.le;


    opens com.example.codeclass to javafx.fxml;
    exports com.example.codeclass;
}