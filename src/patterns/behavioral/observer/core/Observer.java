package patterns.behavioral.observer.core;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public interface Observer {

    void update(double temperature, double humidity, double pressure);

}
