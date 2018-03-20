package patterns.structural.decorator.custom.beverage;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
