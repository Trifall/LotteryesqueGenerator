package lottery;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.geometry.*;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.*;

public class Lottery extends Application {
       
       @Override 
       public void start(Stage primaryStage) throws IOException {

              Parent root = FXMLLoader.load(getClass().getResource("style.fxml"));


              Scene scene = new Scene(root);
              scene.setRoot(root);
              primaryStage.setScene(scene);
              primaryStage.setTitle("Lottery Winners");
              primaryStage.setResizable(false);
              primaryStage.show(); 
              primaryStage.setOnCloseRequest(e -> System.exit(0));
       }
       public static void main(String[] args) {
              launch(args);
       }
             
}
