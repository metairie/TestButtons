package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button btn;

    @FXML
    TextField textField, textField1;

    @FXML
    StackPane stackPane;

    public void click(ActionEvent actionEvent) {
        System.out.println(btn.getText());
        System.out.println(btn.textProperty().get());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image(getClass().getResourceAsStream("close.png"));
        btn.setGraphic(new ImageView(image));
        btn.setContentDisplay(ContentDisplay.RIGHT);
        btn.setAlignment(Pos.BASELINE_RIGHT);
        btn.setPadding(new Insets(1, 5, 1, 5));
        btn.textProperty().bind(textField.textProperty());
    }

}
