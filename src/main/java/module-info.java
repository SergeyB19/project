module com.zaurtregulov.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zaurtregulov.project to javafx.fxml;
    exports com.zaurtregulov.project;
}