package ex33;

import java.util.Set;

public class Leaf<T extends Summable<T> & Comparable<T>> implements Tree<T> {
    private final T val;

    public Leaf(final T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean contains(T val) {
        return val.equals(this.val);
    }

    @Override
    public Set<T> values() {
        return Set.of(this.val);
    }

    @Override
    public T sum() {
        return val;
    }

    @Override
    public T min() {
        return val;
    }

    @Override
    public T max() {
        return val;
    }

    @Override
    public boolean isSorted() {
        return true;
    }
}
