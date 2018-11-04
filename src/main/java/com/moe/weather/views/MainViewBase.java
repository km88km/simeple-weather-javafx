package com.moe.weather.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainViewBase extends AnchorPane {

    private FXMLLoader loader;

    public MainViewBase() {
        this.loader = new FXMLLoader(this.getClass().getClassLoader().getResource("main-view.fxml"));
        this.loader.setRoot(this);
        try {
            this.loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
