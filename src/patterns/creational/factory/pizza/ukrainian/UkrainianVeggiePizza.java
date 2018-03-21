package patterns.creational.factory.pizza.ukrainian;

import patterns.creational.factory.ingredient.factory.PizzaIngredientFactory;
import patterns.creational.factory.pizza.Pizza;
import patterns.creational.factory.pizza.PizzaType;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public class UkrainianVeggiePizza extends Pizza {

    public UkrainianVeggiePizza(final String description, final PizzaType type,
                                final PizzaIngredientFactory pizzaIngredientFactory) {
        super(description, type, pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getDescription());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + getDescription());
    }

}
