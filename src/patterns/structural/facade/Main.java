package patterns.structural.facade;

import patterns.structural.facade.entities.DvdPlayer;
import patterns.structural.facade.entities.Projector;
import patterns.structural.facade.entities.Screen;
import patterns.structural.facade.entities.Tuner;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Main {

    public static void main(String[] args) {
        final Screen screen = new Screen();
        final Projector projector = new Projector();
        final Tuner tuner = new Tuner();
        final DvdPlayer dvdPlayer = new DvdPlayer();

        final HomeTheaterFacade homeTheater = new HomeTheaterFacade(screen, projector, tuner, dvdPlayer);

        homeTheater.watchMovie("Home alone");
        homeTheater.endMovie();
    }
}
