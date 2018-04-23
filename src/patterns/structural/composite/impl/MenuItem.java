package patterns.structural.composite.impl;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class MenuItem implements MenuComponent {

    private String name;

    private String description;

    private boolean isVegetarian;

    private double price;

    public MenuItem(final String name, final String description, final boolean isVegetarian, final double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
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
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.println(getName() + " : " + getDescription() + " == $" + getPrice());
    }

    @Override
    public boolean addComponent(final MenuComponent component) {
        throw new UnsupportedOperationException("Unsupported operation for MenuItem");
    }

    @Override
    public boolean removeComponent(final MenuComponent component) {
        throw new UnsupportedOperationException("Unsupported operation for MenuItem");
    }

    @Override
    public MenuComponent getChild(final int index) {
        throw new UnsupportedOperationException("Unsupported operation for MenuItem");
    }

}
