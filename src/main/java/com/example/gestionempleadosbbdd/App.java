package com.example.gestionempleadosbbdd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Escena
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("VistaMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Stage
        stage.setTitle("Gestión de empleados");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}