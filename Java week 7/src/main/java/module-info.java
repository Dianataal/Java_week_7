module com.example.java_week_7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_week_7 to javafx.fxml;
    exports com.example.java_week_7;
}