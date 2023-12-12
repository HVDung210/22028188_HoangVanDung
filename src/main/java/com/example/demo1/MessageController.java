package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MessageController {
    public void Back(ActionEvent event) {
        try {
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("MessengerApp.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Call1(ActionEvent event) {
        try {
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("Call1.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Call2(ActionEvent event) {
        try {
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("Call2.fxml"));
            Scene quizscene = new Scene(quiz.load());
            quizscene.setFill(Color.TRANSPARENT);
            Stage quizstage = new Stage();
            quizstage.setScene(quizscene);
            quizstage.initStyle(StageStyle.TRANSPARENT);
            quizstage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
