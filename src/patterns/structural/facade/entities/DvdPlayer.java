package patterns.structural.facade.entities;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class DvdPlayer implements Regulable {

    @Override
    public void on() {
        System.out.println("The DVD-player is on");
    }

    @Override
    public void off() {
        System.out.println("The DVD-player is off");
    }

    public void playMovie(final String name) {
        System.out.println("Playing movie: " + name);
    }
}
