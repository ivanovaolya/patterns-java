package patterns.behavioral.observer.display;

import patterns.behavioral.observer.core.Observer;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class CurrentConditionsDisplay implements Observer, Display {

    private double temperature;

    private double humidity;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "[F degrees] and " + humidity + "% humidity");
    }

    @Override
    public void update(final double temperature, final double humidity, final double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay";
    }

}
