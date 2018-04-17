package patterns.behavioral.iterator.impl;

import patterns.behavioral.iterator.menu.DinerMenu;
import patterns.behavioral.iterator.menu.MenuItem;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems; // for Array

    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.length ||menuItems[position] == null);
    }

    @Override
    public MenuItem next() {
        final MenuItem menuItem = menuItems[position];
        position++;

        return menuItem;
    }

}
