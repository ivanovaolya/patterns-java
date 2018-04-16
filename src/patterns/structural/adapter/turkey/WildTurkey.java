package patterns.structural.adapter.turkey;

/**
 * @author ivanovaolyaa
 * @version 4/16/2018
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("I'm Wild Turkey. I'm gobbling");
    }

    @Override
    public void fly() {
        System.out.println("I'm Wild Turkey. I'm flying");
    }

}
