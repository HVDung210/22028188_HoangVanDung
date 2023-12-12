package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UserController {
    @FXML
    private Button Close;


    public void handleCloseAction1() {
        Stage stage = (Stage) (Close).getScene().getWindow();
        stage.close();
    }

    public void Back1(ActionEvent event) {
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
}
