package ru.staroverov.staroverov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ResultController {

    @FXML
    private Label l;

    @FXML
    private ImageView qwe;

    @FXML
    private TextField xt;

    @FXML
    private TextField yt;

    @FXML
    void q(ActionEvent event) {
        float x=Float.parseFloat(xt.getText().toString());
        float y=Float.parseFloat(yt.getText().toString());
        Image image=new Image(getClass().getResourceAsStream("/Screenshot_10.png"));
        qwe.setImage(image);

        if (x <= 0 && y >= 0 && y <= 23 && y >= -x) {
            if (y == 23 || y == -x || x == 0 || y == 0) {
                l.setText("На границе");
            } else {
                l.setText("Да");
            }
        } else {
            l.setText("Нет");
        }
    }

}
