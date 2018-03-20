package patterns.structural.decorator.custom.ingredient;

import patterns.structural.decorator.custom.beverage.Beverage;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class Soy extends IngredientDecorator {

    public Soy(final Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return getBeverage().cost() + 0.89;
    }

}
