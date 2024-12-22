module ru.staroverov.staroverov_task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.staroverov.staroverov_task1 to javafx.fxml;
    exports ru.staroverov.staroverov_task1;
}