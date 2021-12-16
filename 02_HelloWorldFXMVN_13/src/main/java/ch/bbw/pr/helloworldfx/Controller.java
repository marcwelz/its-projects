package ch.bbw.pr.helloworldfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField zahlA;

    @FXML
    private TextField zahlB;

    @FXML
    private TextField output;

    @FXML
    public void clear() {
        zahlA.clear();
        zahlB.clear();
        output.clear();
    }

    public void handleButton(ActionEvent event) {
        Button button = (Button) event.getTarget();

        int a = Integer.valueOf(zahlA.getText());
        int b = Integer.valueOf(zahlB.getText());



            case ">" :
                output.setText(String.valueOf(a > b));
                break;

            case "<" :
                output.setText(String.valueOf(a < b));
                break;

            case ">=" :
                output.setText(String.valueOf(a >= b));
                break;

            case "<=" :
                output.setText(String.valueOf(a <= b));
                break;

            case "==" :
                output.setText(String.valueOf(a == b));
                break;

            case "!=" :
                output.setText(String.valueOf(a != b));
                break;
        }

    }
}
