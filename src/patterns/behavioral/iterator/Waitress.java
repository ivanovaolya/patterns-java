package patterns.behavioral.iterator;

import patterns.behavioral.iterator.impl.Iterator;
import patterns.behavioral.iterator.menu.Menu;
import patterns.behavioral.iterator.menu.MenuItem;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class Waitress {

    private Menu pancakeMenu;

    private Menu dinerMenu;

    public Waitress(final Menu pancakeMenu, final Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        final Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("== DINER MENU ==");
        printMenu(dinerMenuIterator);

        final Iterator<MenuItem> pancakeMenuIterator = pancakeMenu.createIterator();
        System.out.println("== PANCAKE MENU ==");
        printMenu(pancakeMenuIterator);
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
