package patterns.behavioral.iterator.menu;

import patterns.behavioral.iterator.impl.Iterator;
import patterns.behavioral.iterator.impl.PancakeMenuIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class PancakeMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<>();

        addItem("Blueberry Pancake", "Pancakes made with fresh blueberries", true, 45.15);
        addItem("Meat Pancake", "Pancakes made with meat", false, 99.95);
    }

    public void addItem(final String name, final String description, final boolean isVegetarian, final double price) {
        menuItems.add(new MenuItem(name, description, isVegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new PancakeMenuIterator(menuItems);
    }

}
