package patterns.creational.factory.store;

import patterns.creational.factory.ingredient.factory.PizzaIngredientFactory;
import patterns.creational.factory.ingredient.factory.UkrainianPizzaIngredientFactory;
import patterns.creational.factory.pizza.Pizza;
import patterns.creational.factory.pizza.PizzaType;
import patterns.creational.factory.pizza.ukrainian.UkrainianCheesePizza;
import patterns.creational.factory.pizza.ukrainian.UkrainianVeggiePizza;

import java.util.Optional;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public class UkrainianPizzaStore extends PizzaStore {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public UkrainianPizzaStore() {
        pizzaIngredientFactory = new UkrainianPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(final String type) {
        Pizza pizza = null;

        if (PizzaType.CHEESE.name().equals(type)) {
            pizza = new UkrainianCheesePizza("Ukrainian cheese pizza",
                    PizzaType.CHEESE, pizzaIngredientFactory);
        } else if (PizzaType.VEGGIE.name().equals(type)) {
            pizza = new UkrainianVeggiePizza("Ukrainian veggie pizza",
                    PizzaType.VEGGIE, pizzaIngredientFactory);
        }

        return pizza;
    }

}
