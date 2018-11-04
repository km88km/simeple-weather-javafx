package com.moe.weather;

import com.moe.weather.views.MainViewBase;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyJavaFxHacker extends Application {

    @Override
    public void start(Stage stage) {
//        Button button = new Button("search");
//        Label cityNameLab = new Label("city:");
//        Label cityNameVal = new Label("");
//        Label cityTempLab = new Label("temp:");
//        Label cityTempVal = new Label("");
//        HBox h1 = new HBox();
//        h1.getChildren().addAll(cityNameLab, cityNameVal);
//        HBox h2 = new HBox();
//        h2.getChildren().addAll(cityTempLab, cityTempVal);
//
//        TextField city = new TextField();
//        city.setPromptText("enter city");
//        OpenWeatherService serv = new OpenWeatherService();
//        button.setOnAction(e -> {
//            CompletableFuture.supplyAsync(() -> serv.getWetherByCity(city.getText()))
//                    .thenAccept(r -> {
//                        Platform.runLater(() -> {
//                            cityTempVal.setText(r.getMain().formatedTemp());
//                            cityNameVal.setText(city.getText());
//                        });
//                    });
//        });
//
//        VBox v = new VBox();
//        v.getChildren().addAll(h1, h2, city, button);
        Scene scene = new Scene(new MainViewBase(), 300, 200);
        stage.setScene(scene);

        stage.setTitle("FxSample");
        stage.show();
    }
}
