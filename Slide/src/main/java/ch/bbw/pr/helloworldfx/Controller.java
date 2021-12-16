package ch.bbw.pr.helloworldfx;

import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

public class Controller {
    private Model model;

    @FXML
    private Slider slider1;

    @FXML
    private Slider slider2;

    @FXML
    private Slider slider3;

    @FXML
    private ProgressBar progressBar1;

    @FXML
    private ProgressBar progressBar2;

    @FXML
    private ImageView imageView;

    @FXML
    private ListView listView;

    public void initialize() {

        ObservableList<String> list = FXCollections.observableArrayList();

        slider1.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider1 value changed. From: " + oldValue + " to: " + newValue.intValue());
            list.add("Slider1 value changed. From: " + oldValue + " to: " + newValue.intValue());
        });

        slider2.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider2 value changed. From: " + oldValue + " to: " + newValue.intValue());
            list.add("Slider2 value changed. From: " + oldValue + " to: " + newValue.intValue());
        });

        slider3.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider3 value changed. From: " + oldValue + " to: " + newValue.intValue());
            list.add("Slider3 value changed. From: " + oldValue + " to: " + newValue.intValue());
        });

        listView.setItems(list);
    }

}
