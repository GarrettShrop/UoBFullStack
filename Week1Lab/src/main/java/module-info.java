module com.example.week1lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week1lab to javafx.fxml;
    exports com.example.week1lab;
}