package ru.staroverov.staroverov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField LText;

    @FXML
    private Label RLabel;

    @FXML
    private Label SLabel;
    @FXML
    private Button BtnR;

    @FXML
    void BtnResult(ActionEvent event) {
        float L=Float.parseFloat(LText.getText().toString());
        float R=L/2/(float) Math.PI;
        RLabel.setText(String.format("R=%.2f",R));
        float S=(float)Math.PI*(float) Math.pow(R,2);
        SLabel.setText(String.format("S=%.2f",S));

    }

}
