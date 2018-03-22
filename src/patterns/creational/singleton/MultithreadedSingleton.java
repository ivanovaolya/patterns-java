package patterns.creational.singleton;

/**
 * @author ivanovaolyaa
 * @version 3/22/2018
 */
public class MultithreadedSingleton {

    private volatile static MultithreadedSingleton instance;

    private MultithreadedSingleton() {}

    public static MultithreadedSingleton getInstance() {
        if (instance == null) {
            // synchronization is executed ONLY at the first invocation of .getInstance()
            synchronized(MultithreadedSingleton.class) {
                if (instance == null) { // ! check if the instance is STILL null
                    instance = new MultithreadedSingleton();
                }
            }
        }

        return instance;
    }


}
