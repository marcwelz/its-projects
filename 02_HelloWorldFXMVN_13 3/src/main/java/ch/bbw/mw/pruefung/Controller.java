package ch.bbw.mw.pruefung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField franken;

    @FXML
    private TextField euro;

    @FXML
    private TextField pfund;

    @FXML
    private TextField dollar;

    @FXML
    public void clear() {
        franken.clear();
        euro.clear();
        pfund.clear();
        dollar.clear();
    }

    public void handleButton(ActionEvent event) {
        Button button = (Button) event.getTarget();
        try {

            double frankenValue = Double.parseDouble(franken.getText());

            Model model = new Model(frankenValue);

            euro.setText(String.valueOf(model.handlePfund()));
            pfund.setText(String.valueOf(model.handleEuro()));
            dollar.setText(String.valueOf(model.handleDollar()));

        } catch (Exception ex){
            System.out.println("Not a valid double value");
        }
    }


}
