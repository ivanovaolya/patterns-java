package patterns.creational.singleton;

/**
 *
 * Classic example of Singleton pattern
 *
 * @author ivanovaolyaa
 * @version 3/22/2018
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        return instance == null ? new Singleton() : instance;
    }

}
