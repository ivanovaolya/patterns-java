package patterns.behavioral.observer.display;

import patterns.behavioral.observer.core.Observer;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class MeasurementsDisplay implements Observer, Display {

    private double temperature;

    private double humidity;

    private double pressure;

    @Override
    public void display() {
        System.out.println("Measurements: " + temperature + "[F degrees], " + humidity + "% humidity and pressure " +
        pressure + " [Pa]");
    }

    @Override
    public void update(final double temperature, final double humidity, final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String toString() {
        return "MeasurementsDisplay";
    }
}
