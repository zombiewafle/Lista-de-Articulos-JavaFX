package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Control de Listas de Compra");
        primaryStage.setScene(new Scene(root, 450, 375));
        primaryStage.show();
    }


    public static void Main(String[] args) {
        launch(args);
    }
}