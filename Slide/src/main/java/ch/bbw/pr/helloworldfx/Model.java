package ch.bbw.pr.helloworldfx;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

    private ObservableList<String> protokoll;

    private DoubleProperty[] sliderPorperty;
    private DoubleProperty solvedProperty;

    private int code[];

    private final int SLIDER_START_POSITION = 2;

    public Model() {

        code = new int [] {1,3,4};

        protokoll = FXCollections.observableArrayList();
        sliderPorperty = new DoubleProperty[]   {
                new SimpleDoubleProperty(SLIDER_START_POSITION),
                new SimpleDoubleProperty(SLIDER_START_POSITION),
                new SimpleDoubleProperty(SLIDER_START_POSITION)
        };
        solvedProperty = new SimpleDoubleProperty(0);
        isCodeCorrect();
    }

    private boolean isCodeCorrect() {
        int counter = 0;
        for (int i = 0; i < code.length; i++) {
            if(sliderPorperty[i].getValue().intValue() == code[i]) {
                counter++;
            }
        }

        double koeffient= (double) counter / 3;
        solvedProperty.setValue(koeffient);

        return counter == code.length;
    }

    public void add(String protokollEintrag) {
        protokoll.add(protokollEintrag);
    }

    public ObservableList<String> getProtokoll() {
        return protokoll;
    }
}
