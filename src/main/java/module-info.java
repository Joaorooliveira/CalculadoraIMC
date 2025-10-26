module br.com.joaov.calculadoraimc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens br.com.joaov.calculadoraimc to javafx.fxml;
    exports br.com.joaov.calculadoraimc;
}