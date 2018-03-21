package patterns.creational.factory.ingredient.factory;

import patterns.creational.factory.ingredient.dough.Dough;
import patterns.creational.factory.ingredient.dough.ItalianDough;
import patterns.creational.factory.ingredient.souce.ItalianSauce;
import patterns.creational.factory.ingredient.souce.Sauce;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public class ItalianPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new ItalianSauce();
    }

    @Override
    public Dough createDough() {
        return new ItalianDough();
    }

}
