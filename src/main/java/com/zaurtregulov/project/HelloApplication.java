package com.zaurtregulov.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 718, 400);
//        stage.setTitle("Tic Tac Toe");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SPACE && !HelloController3.jump) {
                HelloController3.jump = true;
            }
            if (e.getCode() == KeyCode.A) {
                HelloController3.left = true;
            }
            if (e.getCode() == KeyCode.D) {
                HelloController3.right = true;
            }
        });

        scene.setOnKeyReleased(e -> {

            if (e.getCode() == KeyCode.A) {
                HelloController3.left = false;
            }

            if (e.getCode() == KeyCode.D) {
                HelloController3.right = false;
            }
            if (e.getCode() == KeyCode.ESCAPE) {
                HelloController3.isPause = !HelloController3.isPause;
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}