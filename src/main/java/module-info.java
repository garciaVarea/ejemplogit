module com.empresa.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.empresa.demojavafx to javafx.fxml;
    exports com.empresa.demojavafx;
}