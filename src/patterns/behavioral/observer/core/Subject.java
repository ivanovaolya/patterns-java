package patterns.behavioral.observer.core;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public interface Subject {

    void registerObservers(Observer... observers);

    void removeObservers(Observer... observers);

    void notifyObservers();

}
