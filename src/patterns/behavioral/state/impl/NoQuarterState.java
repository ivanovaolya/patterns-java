package patterns.behavioral.state.impl;

import patterns.behavioral.state.GumballMachine;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {  // если в автомат бросили монетку, то перейти в новое состояние
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {  // чтобы вернуть монетку, нужно ее сначала бросить
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {   // нет монетки - нет шарика
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {   // шарик выдается только за монетку
        System.out.println("You need to pay first");
    }
}
