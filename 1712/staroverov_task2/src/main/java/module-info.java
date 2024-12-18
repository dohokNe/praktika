module ru.staroverov.staroverov_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.staroverov.staroverov_task2 to javafx.fxml;
    exports ru.staroverov.staroverov_task2;
}