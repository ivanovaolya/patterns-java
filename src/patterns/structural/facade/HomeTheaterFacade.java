package patterns.structural.facade;

import patterns.structural.facade.entities.DvdPlayer;
import patterns.structural.facade.entities.Projector;
import patterns.structural.facade.entities.Screen;
import patterns.structural.facade.entities.Tuner;

/**
 * Main class, helps to make a complex subsystem easier to use
 *
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class HomeTheaterFacade {

    private Screen screen;

    private Projector projector;

    private Tuner tuner;

    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade(final Screen screen, final Projector projector, final Tuner tuner,
                             final DvdPlayer dvdPlayer) {
        this.screen = screen;
        this.projector = projector;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(final String name) {
        System.out.println("Starting home theater to watch movie ..");
        screen.on();
        projector.on();
        projector.wildScreenMode(true);
        tuner.on();
        dvdPlayer.on();
        dvdPlayer.playMovie(name);
    }

    public void endMovie() {
        System.out.println("Shutting home theater ..");
        projector.off();
        tuner.off();
        dvdPlayer.off();
        screen.off();
    }
}
