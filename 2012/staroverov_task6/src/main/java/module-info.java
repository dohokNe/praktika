module ru.staroverov.staroverov_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.staroverov.staroverov_task6 to javafx.fxml;
    exports ru.staroverov.staroverov_task6;
}