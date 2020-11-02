package ex33;

import java.util.Set;

public interface Tree<T extends Summable<T> & Comparable<T>> {
    int size();
    boolean contains(final T val);
    Set<T> values();
    T sum();
    T min();
    T max();
    boolean isSorted();
}