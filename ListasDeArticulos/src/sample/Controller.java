package sample;

import item.Items;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import item.Items;

public class Controller {
    @FXML
    TableView<Items> myListsTableView;

    @FXML
    TableColumn nameColumn;

    @FXML
    TableColumn dateColumn;

    @FXML
    TableColumn unfinishedColumn;

    @FXML
    TableColumn estimatedColumn;

    @FXML
    private Label Label;

    @FXML
    private Button edit;

    @FXML
    private Button eliminate;


    public void OpenNuevaLista(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample1.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Nueva List");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            System.out.println("Cant load new window");
        }
    }
    public void OpenNuevaLista6(ActionEvent event) {
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
