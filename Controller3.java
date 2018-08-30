package sample3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller3 {
    @FXML
    private Button exitbtn;

    @FXML
    private Label lblNewItem;

    @FXML
    private Label lblName;

    @FXML
    private Label lblQuantity;

    @FXML
    private Label lblPrice;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField quantityTextFiield;

    @FXML
    private TextField priceTextField;

    @FXML
    private Button createButton;

    public void OpenNuevaLista4(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Nueva List");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            System.out.println("Cant load new window");
        }
    }

}

