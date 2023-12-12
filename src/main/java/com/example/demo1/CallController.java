package com.example.demo1;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class CallController {
    @FXML
    private Button Time;


    public void EndCall1(ActionEvent event) {
        try {
            time = 0;
            timeline.stop();
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("Message1.fxml"));
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
    public void EndCall2(ActionEvent event) {
        try {
            time = 0;
            timeline.stop();
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader quiz = new FXMLLoader(getClass().getResource("Message2.fxml"));
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

    @FXML
    private void initialize() {
        Time.setText(String.valueOf(time));
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            time++;
            Time.setText(String.valueOf(time));
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        }




    public Timeline timeline = new Timeline();
    static int time = 0;


    }

