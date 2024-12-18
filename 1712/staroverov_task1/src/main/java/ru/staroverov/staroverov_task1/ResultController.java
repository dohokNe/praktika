package ru.staroverov.staroverov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label PLabel;

    @FXML
    private TextField aText;
    @FXML
    private Button btnResult;

    @FXML
    void Btn(ActionEvent event) {
        float a=Float.parseFloat(aText.getText().toString());
        PLabel.setText("P="+(a*a));

    }

}
