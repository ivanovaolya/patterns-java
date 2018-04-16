package patterns.structural.facade.entities;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Tuner implements Regulable {

    @Override
    public void on() {
        System.out.println("The tuner is on");
    }

    @Override
    public void off() {
        System.out.println("The tuner is off");
    }

}
