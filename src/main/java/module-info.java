module com.example.sayitahmin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sayitahmin to javafx.fxml;
    exports com.example.sayitahmin;
}