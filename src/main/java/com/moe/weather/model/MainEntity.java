package com.moe.weather.model;

public class MainEntity {
    private double temp;

    public MainEntity() {
    }

    public double getTemp() {
        return (temp - 273.15);
    }
    public String formatedTemp() {
        double temp = getTemp();
        return String.format("%dC",(int)temp);
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "MainEntity{" +
                "temp=" + temp +
                '}';
    }
}
