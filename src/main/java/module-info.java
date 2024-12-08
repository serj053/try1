module org.example.try1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.try1 to javafx.fxml;
    exports org.example.try1;
}