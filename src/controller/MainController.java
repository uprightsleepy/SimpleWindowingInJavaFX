package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public Button SceneChangeButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Initialized.");
    }

    public void toSecond(ActionEvent actionEvent) throws IOException {
        //loads widget hierarchy on next scene
        Parent root = FXMLLoader.load(getClass().getResource("/view/Second.fxml"));

        //gets stage from the source widget
        Stage stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();

        //creates a new scene
        Scene scene = new Scene(root, 600,400);
        stage.setTitle("Second Scene");

        //sets the name of the new scene
        stage.setScene(scene);

        stage.show();
    }
}
