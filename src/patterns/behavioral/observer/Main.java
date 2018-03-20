package patterns.behavioral.observer;

import patterns.behavioral.observer.core.WeatherData;
import patterns.behavioral.observer.display.CurrentConditionsDisplay;
import patterns.behavioral.observer.display.MeasurementsDisplay;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        MeasurementsDisplay measurementsDisplay = new MeasurementsDisplay();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();

        weatherData.registerObservers(measurementsDisplay, conditionsDisplay);

        weatherData.setMeasurements(14.1, 55.5, 78.12);

        weatherData.removeObservers(measurementsDisplay);

        weatherData.setMeasurements(-1.1, 85.3, 54.78);
    }
}
