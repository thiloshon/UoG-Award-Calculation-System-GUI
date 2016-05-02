package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {




    @Override
    public void start(Stage primaryStage)  {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Module.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("Award Calculation System");



       // primaryStage.setScene(new Scene(root, 1000, 800));


        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.setMaxHeight(800);
        primaryStage.setMaxWidth(1000);
        primaryStage.setMinHeight(800);
        primaryStage.setMinWidth(1000);




        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }{

    }


}