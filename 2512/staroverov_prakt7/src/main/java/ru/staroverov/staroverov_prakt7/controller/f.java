package ru.staroverov.staroverov_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.staroverov.staroverov_prakt7.util.Manager.showChesScene;
import static ru.staroverov.staroverov_prakt7.util.Manager.showSecondScene;

public class f {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private Button reg1;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva.fxml","Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void reg1(ActionEvent event) {
        showChesScene("fi.fxml","Marathon Skills 2016 – Registration confirmation");

    }

}
