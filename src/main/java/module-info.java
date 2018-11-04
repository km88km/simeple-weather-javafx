module com.moe.weather {
    exports com.moe.weather;
    exports com.moe.weather.model;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
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