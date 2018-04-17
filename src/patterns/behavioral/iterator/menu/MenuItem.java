package patterns.behavioral.iterator.menu;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public class MenuItem {

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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }

}
