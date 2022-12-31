module sample.fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.fx to javafx.fxml;
    exports sample.fx;
}