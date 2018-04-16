package patterns.structural.adapter;

import patterns.structural.adapter.duck.Duck;
import patterns.structural.adapter.duck.MallardDuck;
import patterns.structural.adapter.turkey.Turkey;
import patterns.structural.adapter.turkey.WildTurkey;

import java.util.List;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class Main {

    public static void main(String[] args) {
        final Duck duck = new MallardDuck();
        final Turkey turkey = new WildTurkey();

        final List<Duck> ducks = List.of(duck, new TurkeyAdapter(turkey));
        ducks.forEach(d -> {
            d.quack();
            d.fly();
        });
    }

}
