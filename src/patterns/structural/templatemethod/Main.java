package patterns.structural.templatemethod;

import patterns.structural.templatemethod.impl.CaffeineBeverage;
import patterns.structural.templatemethod.impl.Coffee;
import patterns.structural.templatemethod.impl.Tea;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Main {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();

        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();

        coffee.prepareRecipe();
    }
}
