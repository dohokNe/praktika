package ru.staroverov.staroverov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField AText;

    @FXML
    private TextField BText;

    @FXML
    private TextField CText;
    @FXML
    private Button btnr;

    @FXML
    private Label x1L;

    @FXML
    private Label x2L;

    @FXML
    void bResult(ActionEvent event) {
        float a=Float.parseFloat(AText.getText().toString());
        float b=Float.parseFloat(BText.getText().toString());
        float c=Float.parseFloat(CText.getText().toString());
        double D;
        D=Math.pow(b,2)-4*a*c;
        float x1=(-b+(float) Math.sqrt(D)/(2*a));
        float x2=(-b-(float) Math.sqrt(D)/(2*a));
        x1L.setText(String.format("x1=%.2f",x1));
        x2L.setText(String.format("x2=%.2f",x2));


    }

}
