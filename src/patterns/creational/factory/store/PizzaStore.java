package patterns.creational.factory.store;

import patterns.creational.factory.pizza.Pizza;

import java.util.Optional;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public abstract class PizzaStore {

    public Pizza orderPizza(final String type) {
        final Pizza pizza = Optional.ofNullable(createPizza(type)).orElseThrow(RuntimeException::new);

        pizza.prepare();
        pizza.cook();

        return pizza;
    }

    protected abstract Pizza createPizza(final String type);

}
