package patterns.creational.factory.pizza;

import patterns.creational.factory.ingredient.dough.Dough;
import patterns.creational.factory.ingredient.factory.PizzaIngredientFactory;
import patterns.creational.factory.ingredient.souce.Sauce;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public abstract class Pizza {

    private String description;

    private PizzaType type;

    protected Dough dough;

    protected Sauce sauce;

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(final String description, final PizzaType type, final PizzaIngredientFactory pizzaIngredientFactory) {
        this.description = description;
        this.type = type;
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public String getDescription() {
        return description;
    }

    public PizzaType getType() {
        return type;
    }

    public PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    public abstract void prepare();

    public abstract void cook();

    @Override
    public String toString() {
        return description;
    }
}
