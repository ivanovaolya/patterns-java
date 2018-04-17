package patterns.behavioral.iterator;

import patterns.behavioral.iterator.menu.BurgerMenu;
import patterns.behavioral.iterator.menu.MenuItem;

import java.util.Iterator;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class Waiter {

    private BurgerMenu burgerMenu;

    public Waiter(final BurgerMenu burgerMenu) {
        this.burgerMenu = burgerMenu;
    }

    public void printMenu() {
        final Iterator<MenuItem> burgerMenuIterator = burgerMenu.createIterator();
        System.out.println("== BURGER MENU ==");
        printMenu(burgerMenuIterator);

    }

    private void printMenu(final Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            final MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getDescription() + " -- ");
            System.out.print(item.getPrice() + "\n");
        }
    }

}
