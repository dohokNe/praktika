package ru.staroverov.staroverov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField at;

    @FXML
    private TextField bt;

    @FXML
    private TextField ct;

    @FXML
    private TextField dt;

    @FXML
    private Label l;

    @FXML
    void fgh(ActionEvent event) {
        float a=Float.parseFloat(at.getText().toString());
        float b=Float.parseFloat(bt.getText().toString());
        float c=Float.parseFloat(ct.getText().toString());
        float d=Float.parseFloat(dt.getText().toString());
        float v;
        if (a != b && a != c && a != d) {
            v = 1;
        } else if (b != a && b != c && b != d) {
            v = 2;
        } else if (c != a && c != b && c != d) {
            v = 3;
        } else {
            v = 4;
        }
l.setText("Порядковый номер:"+v);
    }

}
