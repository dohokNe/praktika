package ru.staroverov.staroverov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField MT;

    @FXML
    private TextField NT;

    @FXML
    private Label rl;

    @FXML
    void bt(ActionEvent event) {
        float m=Float.parseFloat(MT.getText().toString());
        float n=Float.parseFloat(NT.getText().toString());
        if (n != 0) {
            if (m % n == 0) {
                float v=m/n;
                rl.setText("Частное от деления:"+v);
            } else {
                rl.setText("M на N нацело не делится");
            }
        } else {
            rl.setText("Деление на ноль невозможно");
        }

    }

}
