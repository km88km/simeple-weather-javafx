package com.moe.weather.controllers;

import com.moe.weather.OpenWeatherService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class MainViewController implements Initializable {


    public Label cityLabel;
    public Label valueLabel;
    public TextField searchTextField;
    public Button searchButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initializing");
    }

    @FXML
    public void searchButtonHandler(ActionEvent event) {
        OpenWeatherService serv = new OpenWeatherService();
        System.out.println("clicked");
            CompletableFuture.supplyAsync(() -> serv.getWetherByCity(searchTextField.getText()))
                    .thenAccept(r -> {
                        Platform.runLater(() -> {
                            valueLabel.setText(r.getMain().formatedTemp());
                            cityLabel.setText(searchTextField.getText());
                        });
        });

    }

}
