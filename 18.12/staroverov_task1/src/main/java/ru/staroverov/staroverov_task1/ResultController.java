package ru.staroverov.staroverov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label LMetr;

    @FXML
    private TextField LText;
    @FXML
    private Button BtnResult;

    @FXML
    void BtnResult(ActionEvent event) {
        float L=Float.parseFloat(LText.getText().toString());
        LMetr.setText("L(metr)="+(int)(L/100));


    }

}
