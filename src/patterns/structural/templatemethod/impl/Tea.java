package patterns.structural.templatemethod.impl;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea ..");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon ..");
    }
}
