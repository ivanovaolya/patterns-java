package patterns.behavioral.iterator.impl;

import patterns.behavioral.iterator.menu.MenuItem;

import java.util.List;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class PancakeMenuIterator implements Iterator<MenuItem> {

    private List<MenuItem> menuItems;   // for List

    private int position;

    public PancakeMenuIterator(final List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.size() || menuItems.get(position) == null);
    }

    @Override
    public MenuItem next() {
        final MenuItem menuItem = menuItems.get(position);
        position++;

        return menuItem;
    }
}
