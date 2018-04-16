package patterns.structural.facade.entities;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Projector implements Regulable {

    private boolean screenMode;

    @Override
    public void on() {
        System.out.println("The projector is on");
    }

    @Override
    public void off() {
        System.out.println("The projector is off");
    }

    public void wildScreenMode(final boolean isWildMode) {
        screenMode = isWildMode;
    }

}
