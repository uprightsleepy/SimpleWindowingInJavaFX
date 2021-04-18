module SimpleWindowing {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    exports main;
    opens main to javafx.graphics, javafx.controls, javafx.fxml;
    opens controller to javafx.graphics, javafx.controls, javafx.fxml;

    opens view;
}