package sample1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Controller1 {
    @FXML
    private Button exit;

    @FXML
    private Label lblNewList;

    @FXML
    private Label lblName;

    @FXML
    private Label lblDescrip;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private Button createButton;

    public void OpenNuevaLista1(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Nueva List");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            System.out.println("Cant load new window");
        }
    }
    public void OpenNuevaLista2(ActionEvent event){
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Control de Listas de Compras");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }
}