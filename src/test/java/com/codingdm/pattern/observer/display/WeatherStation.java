package com.codingdm.pattern.observer.display;

import com.codingdm.pattern.observer.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        // 首先定义一个WeatherData主题
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 66, 31.4f);
        weatherData.setMeasurements(82, 67, 32.4f);

    }
}
