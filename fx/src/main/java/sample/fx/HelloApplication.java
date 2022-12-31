package sample.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GamePage.fxml"));
        root=new Group();
        GamePage game=new GamePage();
        root.getChildren().add(game.root);
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Word Disctionary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}