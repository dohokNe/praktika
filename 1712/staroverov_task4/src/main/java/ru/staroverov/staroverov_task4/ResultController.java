package ru.staroverov.staroverov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label YL;

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;
    @FXML
    private Button b;

    @FXML
    private TextField xText;

    @FXML
    void br(ActionEvent event) {
        float a=Float.parseFloat(aText.getText().toString());
        float b=Float.parseFloat(bText.getText().toString());
        float x=Float.parseFloat(xText.getText().toString());
        double y=-Math.pow(a,5)*x+b*Math.pow(Math.cos(Math.pow(x,2)),4)+b*x;
        float Y=((float) Math.sqrt((float)Math.abs(-a*x+y)))/(float) Math.log((x+(float) Math.pow(y,2)));
        YL.setText(String.format("Y=%.2f",Y));

    }

}
