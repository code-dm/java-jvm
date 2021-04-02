package com.codingdm.pattern.observerjdk;

import java.util.Observable;

/**
 * 使用jdk自带的 Observable 类来实现观察者模式
 * Observable是一个类而不是一个接口，甚至没有实现一个接口。
 * 不幸的是， java.util.Observable 的实现有许多问题，显示了他的使用和复用。
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;

    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
