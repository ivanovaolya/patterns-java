package patterns.structural.adapter.duck;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("I'm Mallard Duck. I'm quacking");
    }

    @Override
    public void fly() {
        System.out.println("I'm Mallard Duck. I'm flying");
    }

}
