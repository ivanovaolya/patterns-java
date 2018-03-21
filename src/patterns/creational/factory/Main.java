package patterns.creational.factory;

import patterns.creational.factory.pizza.Pizza;
import patterns.creational.factory.store.ItalianPizzaStore;
import patterns.creational.factory.store.PizzaStore;
import patterns.creational.factory.store.UkrainianPizzaStore;

/**
 * @author ivanovaolyaa
 * @version 3/21/2018
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore italianStore = new ItalianPizzaStore();
        final Pizza italianCheesePizza = italianStore.orderPizza("CHEESE");
        System.out.println(italianCheesePizza);
        
        PizzaStore ukrainianStore = new UkrainianPizzaStore();
        final Pizza ukrainianCheesePizza = ukrainianStore.orderPizza("CHEESE");
        System.out.println(ukrainianCheesePizza);
    }
}
