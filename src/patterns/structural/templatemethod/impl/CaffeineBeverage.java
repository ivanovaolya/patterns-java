package patterns.structural.templatemethod.impl;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public abstract class CaffeineBeverage {

    /**
     * template method
     * provides the algorithm for preparing beverage
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water ..");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup ..");
    }

    protected abstract void brew(); // differ for tea and coffee

    protected abstract void addCondiments();

}
