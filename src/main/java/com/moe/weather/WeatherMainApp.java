package com.moe.weather;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;

public class WeatherMainApp {

    public static void main(String[]  args) {
        new JFXPanel();
        Platform.runLater(() -> {
            Stage stage = new Stage();
            MyJavaFxHacker myJavaFxHacker = new MyJavaFxHacker();
            myJavaFxHacker.start(stage);
        });
    }
}
