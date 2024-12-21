module ru.staroverov.staroverov_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.staroverov.staroverov_task5 to javafx.fxml;
    exports ru.staroverov.staroverov_task5;
}