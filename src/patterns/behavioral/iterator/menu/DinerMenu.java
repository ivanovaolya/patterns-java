package patterns.behavioral.iterator.menu;

import patterns.behavioral.iterator.impl.DinerMenuIterator;
import patterns.behavioral.iterator.impl.Iterator;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class DinerMenu implements Menu {

    public static final int MAX_ITEMS = 6;

    private int numberOfItems = 0;

    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Borsch", "Ukrainian borsch", false, 45.15);
        addItem("Fresh Salad", "Fresh Salad with oil", true, 99.95);
    }

    public void addItem(final String name, final String description, final boolean isVegetarian, final double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, can't add more items");
        }
        menuItems[numberOfItems] = new MenuItem(name, description, isVegetarian, price);
        numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
