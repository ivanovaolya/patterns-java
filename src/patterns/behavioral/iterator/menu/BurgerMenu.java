package patterns.behavioral.iterator.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class BurgerMenu {

    private Map<String, MenuItem> menuItems;

    public BurgerMenu() {
        menuItems = new HashMap<>();

        addItem("NY Burger", "Burger with beef", false, 152.5);
        addItem("Texas Burger", "Burger with pork", false, 132.95);
    }

    public void addItem(final String name, final String description, final boolean isVegetarian, final double price) {
        menuItems.put(name, new MenuItem(name, description, isVegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {    // using in-built iterator
        return menuItems.values().iterator();  // iterator only for values
    }
}
