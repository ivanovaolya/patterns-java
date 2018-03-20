package patterns.behavioral.observer.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private double temperature;

    private double humidity;

    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObservers(final Observer... o) {
        Collections.addAll(observers, o);
        System.out.println("Registered observers: " + Arrays.toString(o));
    }

    @Override
    public void removeObservers(final Observer... o) {
        observers.removeAll(Arrays.asList(o));
        System.out.println("Removed observers: " + Arrays.toString(o));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

}
