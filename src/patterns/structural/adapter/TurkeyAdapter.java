package patterns.structural.adapter;

import patterns.structural.adapter.duck.Duck;
import patterns.structural.adapter.turkey.Turkey;

/**
 * The main goal of TurkeyAdapter is to cast one interface to another
 *
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(final Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

}
