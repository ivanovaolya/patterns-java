package patterns.structural.decorator.custom;

import patterns.structural.decorator.custom.beverage.Beverage;
import patterns.structural.decorator.custom.beverage.Espresso;
import patterns.structural.decorator.custom.beverage.HouseBlend;
import patterns.structural.decorator.custom.ingredient.Milk;
import patterns.structural.decorator.custom.ingredient.Soy;

/**
 * @author ivanovaolyaa
 * @version 3/20/2018
 */
public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend); // "wrap" original beverage with new ingredient
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend);

    }
}
