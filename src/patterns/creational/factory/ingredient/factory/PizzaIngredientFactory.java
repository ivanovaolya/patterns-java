package patterns.creational.factory.ingredient.factory;

import patterns.creational.factory.ingredient.dough.Dough;
import patterns.creational.factory.ingredient.souce.Sauce;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public interface PizzaIngredientFactory {

    Sauce createSauce();

    Dough createDough();

}
