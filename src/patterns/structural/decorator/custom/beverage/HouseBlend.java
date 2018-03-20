package patterns.structural.decorator.custom.beverage;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class HouseBlend extends Beverage {


    @Override
    public String getDescription() {
        return "House Blend coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
