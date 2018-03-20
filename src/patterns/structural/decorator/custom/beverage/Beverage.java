package patterns.structural.decorator.custom.beverage;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public abstract class Beverage {

    public abstract String getDescription();

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
