module com.example.gestionempleadosbbdd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires mysql.connector.java;
    requires java.sql;

    opens com.example.gestionempleadosbbdd to javafx.fxml;
    exports com.example.gestionempleadosbbdd;
}