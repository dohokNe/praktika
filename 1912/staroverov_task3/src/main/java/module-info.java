module ru.staroverov.staroverov_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.staroverov.staroverov_task3 to javafx.fxml;
    exports ru.staroverov.staroverov_task3;
}