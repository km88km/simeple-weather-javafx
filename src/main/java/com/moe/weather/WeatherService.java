package com.moe.weather;

import com.moe.weather.model.WeatherResult;

public interface WeatherService {
    WeatherResult getWetherByCity(String city);
}
