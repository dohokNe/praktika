package ru.staroverov.staroverov_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label aL;

    @FXML
    private TextField aT;

    @FXML
    void asd(ActionEvent event) {
        float a=Float.parseFloat(aT.getText().toString());
        if (a > 0) {
            a -= 8;
        }

        aL.setText("a="+a);

    }

}
