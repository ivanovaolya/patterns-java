package patterns.structural.composite.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class Menu implements MenuComponent {

    private List<MenuComponent> menuComponents;

    private String name;

    private String description;

    public Menu(final String name, final String description) {
        menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Unsupported operation for Menu");
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException("Unsupported operation for Menu");
    }

    @Override
    public void print() {
        System.out.println("Menu: " + getName() + " -- " + getDescription());

        final Iterator<MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    public boolean addComponent(final MenuComponent component) {
        return menuComponents.add(component);
    }

    @Override
    public boolean removeComponent(final MenuComponent component) {
        return menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(final int index) {
        return menuComponents.get(index);
    }

}
