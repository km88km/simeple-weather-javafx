package com.moe.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moe.weather.model.WeatherResult;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;

public class OpenWeatherService implements WeatherService {

    private ObjectMapper mapper;

    public OpenWeatherService() {
        this.mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Override
    public WeatherResult getWetherByCity(String city) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=ba96e059524abe8fed603491ee9454c0");
        Response response = target.request().get();
        if (!response.getStatusInfo().equals(Response.Status.OK)) {
            throw new IllegalArgumentException("something baaaad"+response.getStatus());
        }
        String json = response.readEntity(String.class);
        try {
            WeatherResult result = mapper.readValue(json, WeatherResult.class);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new WeatherResult();
    }
}
