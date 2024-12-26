module ru.staroverov.staroverov_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.staroverov.staroverov_prakt7 to javafx.fxml;
    exports ru.staroverov.staroverov_prakt7;
    exports ru.staroverov.staroverov_prakt7.controller;
    opens ru.staroverov.staroverov_prakt7.controller to javafx.fxml;
}