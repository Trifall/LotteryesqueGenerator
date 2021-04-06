package lottery;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GUIController implements Initializable {


    FlashThread ft1;
    FlashThread ft2;
    FlashThread ft3;
    FlashThread ft4;
    FlashThread ft5;
    FlashThread ft6;

    ArrayList<FlashThread> threads = new ArrayList<>();


    @FXML
    public Label numLabel1;
    @FXML
    public Label numLabel2;
    @FXML
    public Label numLabel3;
    @FXML
    public Label numLabel4;
    @FXML
    public Label numLabel5;
    @FXML
    public Label numLabel6;


    @FXML
    public AnchorPane anchorPane;
    @FXML
    public Button stopButton1;

    @FXML
    private void stopButton1_Press(ActionEvent event)
    {
        if(ft1.getPauseThreadFlag()){
            ft1.resumeThread();
            numLabel1.setStyle("-fx-text-fill: #000000");
        }
        else {
            try {
                ft1.pauseThread();
                numLabel1.setStyle("-fx-text-fill: #FF0000");
                stopButton1.setText("Start");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public Button stopButton2;

    public void stopButton2_Press(ActionEvent actionEvent) {
        if(ft2.getPauseThreadFlag()){
            ft2.resumeThread();
            numLabel2.setStyle("-fx-text-fill: #000000");
        }
        else {
            try {
                ft2.pauseThread();
                numLabel2.setStyle("-fx-text-fill: #FF0000");
                stopButton2.setText("Start");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public Button stopButton3;

    public void stopButton3_Press(ActionEvent actionEvent) {
        if(ft3.getPauseThreadFlag()){
            ft3.resumeThread();
            numLabel3.setStyle("-fx-text-fill: #000000");
        }
        else {
            try {
                ft3.pauseThread();
                numLabel3.setStyle("-fx-text-fill: #FF0000");
                stopButton3.setText("Start");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public Button stopButton4;

    public void stopButton4_Press(ActionEvent actionEvent) {
        if(ft4.getPauseThreadFlag()){
            ft4.resumeThread();
            numLabel4.setStyle("-fx-text-fill: #000000");
        }
        else {
            try {
                ft4.pauseThread();
                numLabel4.setStyle("-fx-text-fill: #FF0000");
                stopButton4.setText("Start");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public Button stopButton5;

    public void stopButton5_Press(ActionEvent actionEvent) {
        if(ft5.getPauseThreadFlag()){
            ft5.resumeThread();
            numLabel5.setStyle("-fx-text-fill: #000000");
        }
        else {
            try {
                ft5.pauseThread();
                numLabel5.setStyle("-fx-text-fill: #FF0000");
                stopButton5.setText("Start");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public Button stopButton6;

    public void stopButton6_Press(ActionEvent actionEvent) {
        if(ft6.getPauseThreadFlag()){
            ft6.resumeThread();
            numLabel6.setStyle("-fx-text-fill: #000000");
        }
        else {
            try {
                ft6.pauseThread();
                numLabel6.setStyle("-fx-text-fill: #FF0000");
                stopButton6.setText("Start");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public Button addButton;

    public void addButton_Press(ActionEvent actionEvent) {
        String numbers = "";

        for (FlashThread thread : threads) {
            if(thread.getPauseThreadFlag()){
                numbers = numbers + thread.getLabelText();
            }
        }

        textArea.appendText(numbers.toString() + "\n");
    }

    @FXML
    public Button clearButton;

    public void clearButton_Press(ActionEvent actionEvent) {
        textArea.clear();
    }

    @FXML
    public Button exitButton;

    public void exitButton_Press(ActionEvent actionEvent) {
        System.exit(0);
    }

    public TextArea textArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Platform.runLater(() -> {



            ft1 = new FlashThread(numLabel1);
            ft2 = new FlashThread(numLabel2);
            ft3 = new FlashThread(numLabel3);
            ft4 = new FlashThread(numLabel4);
            ft5 = new FlashThread(numLabel5);
            ft6 = new FlashThread(numLabel6);

            ft1.start();
            ft2.start();
            ft3.start();
            ft4.start();
            ft5.start();
            ft6.start();

            threads.add(ft1);
            threads.add(ft2);
            threads.add(ft3);
            threads.add(ft4);
            threads.add(ft5);
            threads.add(ft6);


        });
    }



}
