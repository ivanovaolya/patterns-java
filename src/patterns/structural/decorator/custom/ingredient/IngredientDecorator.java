package patterns.structural.decorator.custom.ingredient;

import patterns.structural.decorator.custom.beverage.Beverage;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public abstract class IngredientDecorator extends Beverage {

    private Beverage beverage;

    public IngredientDecorator(final Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

}
