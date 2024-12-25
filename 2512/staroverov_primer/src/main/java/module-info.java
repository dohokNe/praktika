module ru.staroverov.staroverov_primer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.staroverov.staroverov_primer to javafx.fxml;
    exports ru.staroverov.staroverov_primer;
    exports ru.staroverov.staroverov_primer.controller;
    opens ru.staroverov.staroverov_primer.controller to javafx.fxml;
}