package sample2;

import item.ShoppingItems;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class Controller2 {
    @FXML
    private TableView<ShoppingItems> mySecondTableView;

    @FXML
    private Button exitbutton;

    @FXML
    private Label lblNombreLista;

    @FXML
    private Button btnNuevoItem;

    @FXML
    private Label lblDescripcion;

    @FXML
    private TableColumn itemsCol;

    @FXML
    private TableColumn quantityCol;

    @FXML
    private TableColumn unitaryCol;

    @FXML
    private TableColumn totalCol;

    @FXML
    private TableColumn statusCol;

    @FXML
    private Label lblUnfinished;

    @FXML
    private Label lblNumUnfinished;

    @FXML
    private Label lblMark;

    @FXML
    private Button btnUnfinished;

    @FXML
    private Button btnBought;

    public void OpenNuevaLista3 (ActionEvent event) {
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

