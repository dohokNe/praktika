package ru.staroverov.staroverov_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.staroverov.staroverov_prakt7.util.Manager.showCheScene;
import static ru.staroverov.staroverov_prakt7.util.Manager.showSecondScene;

public class q {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private Button reg;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva.fxml","Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void reg(ActionEvent event) {
        showCheScene("f.fxml","Marathon Skills 2016 – Register for an event");

    }

}
