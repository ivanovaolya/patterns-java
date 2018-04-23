package patterns.behavioral.state;

import patterns.behavioral.state.impl.HasQuarterState;
import patterns.behavioral.state.impl.NoQuarterState;
import patterns.behavioral.state.impl.SoldOutState;
import patterns.behavioral.state.impl.SoldState;
import patterns.behavioral.state.impl.State;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class GumballMachine {
    // all possible states
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(final int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = count; // number of gumballs

        if (count > 0) {
            state = noQuarterState;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(final State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ..");

        if (count != 0) {
            count--;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine: state = " + state.getClass().getSimpleName() + "; count = " + count;
    }

}
