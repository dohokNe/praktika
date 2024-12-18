package ru.staroverov.staroverov_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class ResultController {

    @FXML
    private TextField KText;

    @FXML
    private Label dayLabel;
    @FXML
    private Button BtnResult;


    @FXML
    void BtnResult(ActionEvent event) {
        float K=Float.parseFloat(KText.getText().toString());
        int b=(int)(K%7+1)%7;
        switch (b){
            case 1:
                dayLabel.setText("Воскресенье");
                break;
            case 2:
                dayLabel.setText("Понедельник");
                break;
            case 3:
                dayLabel.setText("Вторник");
                break;
            case 4:
                dayLabel.setText("Среда");
                break;
            case 5:
                dayLabel.setText("Четверг");
                break;
            case 6:
                dayLabel.setText("Пятница");
                break;
            case 0:
                dayLabel.setText("Суббота");
                break;
        }

    }

}
