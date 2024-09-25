package es.ieslosmontecillos.mouseevent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Mouse Event");
        stage.setScene(scene);
        StackPane stackPane = new StackPane();

        Label label = new Label("Programming is fun!");

        label.setOnMouseDragged(e-> {

            label.setTranslateY(e.getSceneY());
            label.setTranslateX(e.getSceneX());


        });



        stackPane.getChildren().add(label);
        root.getChildren().add(stackPane);

        scene.setRoot(root);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}