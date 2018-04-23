package patterns.structural.composite.impl;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public interface MenuComponent {

    String getName();

    String getDescription();

    double getPrice();

    boolean isVegetarian();

    void print();

    boolean addComponent(MenuComponent component);

    boolean removeComponent(MenuComponent component);

    MenuComponent getChild(int index);

}
