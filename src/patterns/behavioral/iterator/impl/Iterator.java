package patterns.behavioral.iterator.impl;

/**
 * The Iterator is used to traverse a container and access the container's elements
 *
 * @author ivanovaolyaa
 * @version 4/17/2018
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

}
