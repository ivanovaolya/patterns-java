package patterns.behavioral.iterator.menu;

import patterns.behavioral.iterator.impl.Iterator;

/**
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public interface Menu {

    Iterator<MenuItem> createIterator();

}
