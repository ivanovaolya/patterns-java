package patterns.behavioral.state;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class Main {

    public static void main(String[] args) {
        final GumballMachine gumballMachine = new GumballMachine(3);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}
