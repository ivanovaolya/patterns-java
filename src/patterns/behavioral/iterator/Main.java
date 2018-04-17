package patterns.behavioral.iterator;

import patterns.behavioral.iterator.menu.BurgerMenu;
import patterns.behavioral.iterator.menu.DinerMenu;
import patterns.behavioral.iterator.menu.PancakeMenu;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class Main {

    public static void main(String[] args) {
        final Waitress waitress = new Waitress(new PancakeMenu(), new DinerMenu());

        waitress.printMenu();

        final Waiter waiter = new Waiter(new BurgerMenu());

        waiter.printMenu();
    }
}
