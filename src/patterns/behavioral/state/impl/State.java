package patterns.behavioral.state.impl;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

}
