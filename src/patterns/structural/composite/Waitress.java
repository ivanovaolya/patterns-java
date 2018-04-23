package patterns.structural.composite;

import patterns.structural.composite.impl.MenuComponent;

/**
 * @author ivanovaolyaa
 * @version 4/23/2018
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(final MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

}
