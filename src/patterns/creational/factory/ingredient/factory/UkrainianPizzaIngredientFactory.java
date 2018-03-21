package patterns.creational.factory.ingredient.factory;

import patterns.creational.factory.ingredient.dough.Dough;
import patterns.creational.factory.ingredient.dough.UkrainianDough;
import patterns.creational.factory.ingredient.souce.Sauce;
import patterns.creational.factory.ingredient.souce.UkrainianSauce;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public class UkrainianPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new UkrainianSauce();
    }

    @Override
    public Dough createDough() {
        return new UkrainianDough();
    }
}
