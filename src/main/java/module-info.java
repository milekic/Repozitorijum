module com.example.kozara {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kozara to javafx.fxml;
    exports com.example.kozara;
}