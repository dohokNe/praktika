package ru.staroverov.staroverov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label NumLabel;

    @FXML
    private TextField NumText;
    @FXML
    private Button BtnResult;


    @FXML
    void ResultBtn(ActionEvent event) {
        float a=Float.parseFloat(NumText.getText().toString());
        double b;
        double c;
        b=a%10;
        c=a/10;
        NumLabel.setText("Num="+(int)(b*100+c));

    }

}
