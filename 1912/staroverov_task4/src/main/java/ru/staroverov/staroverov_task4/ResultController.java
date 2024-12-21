package ru.staroverov.staroverov_task4;
import static java.lang.Math.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private TextField xT;

    @FXML
    private Label yL;

    @FXML
    void ret(ActionEvent event) {
        float x=Float.parseFloat(xT.getText().toString());
        double y;
        if (x < 0) {
            y =pow(x, 2) - 3 * cbrt(PI - x);
        } else if (x >= 0 && x < 1) {
            y =pow(pow(x,2) + 3, 2)-sqrt(0.5 * PI + x);
        } else {
            y =x *(pow(x,2) +3) +log(PI + x);
        }
        yL.setText(String.format("Y=%.2f",y));

    }

}
