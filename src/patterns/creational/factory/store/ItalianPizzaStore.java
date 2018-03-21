package patterns.creational.factory.store;

import patterns.creational.factory.ingredient.factory.ItalianPizzaIngredientFactory;
import patterns.creational.factory.ingredient.factory.PizzaIngredientFactory;
import patterns.creational.factory.pizza.italian.ItalianCheesePizza;
import patterns.creational.factory.pizza.Pizza;
import patterns.creational.factory.pizza.PizzaType;
import patterns.creational.factory.pizza.italian.ItalianVeggiePizza;

import java.util.Optional;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public class ItalianPizzaStore extends PizzaStore {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ItalianPizzaStore() {
        pizzaIngredientFactory = new ItalianPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(final String type) {

        Pizza pizza = null;

        if (PizzaType.CHEESE.name().equals(type)) {
            pizza = new ItalianCheesePizza("Italian cheese pizza",
                    PizzaType.CHEESE, pizzaIngredientFactory);
        } else if (PizzaType.VEGGIE.name().equals(type)) {
            pizza = new ItalianVeggiePizza("Italian veggie pizza",
                    PizzaType.VEGGIE, pizzaIngredientFactory);
        }

        return pizza;
    }
}
