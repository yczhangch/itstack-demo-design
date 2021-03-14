package org.itstack.demo.design.lang;

/**
 * @author My
 */
public interface Collection<E, L> extends Iterable<E> {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    @Override
    Iterator<E> iterator();

}
