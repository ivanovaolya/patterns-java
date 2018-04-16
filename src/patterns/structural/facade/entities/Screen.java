package patterns.structural.facade.entities;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Screen implements Regulable {

    @Override
    public void on() {
        System.out.println("The screen is on");
    }

    @Override
    public void off() {
        System.out.println("The screen is off");
    }
}
