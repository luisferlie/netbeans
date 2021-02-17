/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NewProject extends Application {
//blablabla

    @Override
    public void start(Stage primaryStage) {
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
