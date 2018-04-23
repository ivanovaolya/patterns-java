package patterns.structural.composite;

import patterns.structural.composite.impl.Menu;
import patterns.structural.composite.impl.MenuComponent;
import patterns.structural.composite.impl.MenuItem;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class Main {

    public static void main(String[] args) {
        final MenuComponent breakfastMenu = new Menu("BREAKFAST MENU", "Breakfast");
        final MenuComponent lunchMenu = new Menu("LUNCH MENU", "Lunch");
        final MenuComponent dinerMenu = new Menu("DINER MENU", "Diner");

        final MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.addComponent(breakfastMenu);
        allMenus.addComponent(lunchMenu);
        allMenus.addComponent(dinerMenu);

        breakfastMenu.addComponent(new MenuItem("Eggs", "Boiled eggs", true, 1.99));
        lunchMenu.addComponent(new MenuItem("Salad", "Fresh salad", true, 41.99));
        dinerMenu.addComponent(new MenuItem("Burger", "Beef Burger", false, 82.99));
        dinerMenu.addComponent(lunchMenu);  // possible variant

        final Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
