package patterns.structural.decorator.custom.ingredient;

import patterns.structural.decorator.custom.beverage.Beverage;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class Milk extends IngredientDecorator {

    public Milk(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.5;
    }

}
