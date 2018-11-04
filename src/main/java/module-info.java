module com.moe.weather {
    exports com.moe.weather;
    exports com.moe.weather.model;
    opens com.moe.weather to javafx.graphics;
    opens com.moe.weather.model to javafx.graphics;
    opens com.moe.weather.controllers to javafx.fxml;
    opens com.moe.weather.views to javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.swing;
    requires javafx.fxml;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires jersey.common;
    requires jersey.client;
    requires java.ws.rs;
    requires hk2.api;
    requires hk2.locator;
    requires hk2.utils;
    requires kumuluzee.common;
    requires kumuluzee.jax.rs.jersey;
    requires jersey.media.jaxb;
    requires jaxb.core;
    requires java.xml.bind;
    requires jackson.module.jaxb.annotations;
    requires java.activation;
}