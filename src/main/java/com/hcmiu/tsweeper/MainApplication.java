package com.hcmiu.tsweeper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("T-Sweeper.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("T-Sweeper");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();
    }
}