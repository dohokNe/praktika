module ru.staroverov.staroverov_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.staroverov.staroverov_task4 to javafx.fxml;
    exports ru.staroverov.staroverov_task4;
}