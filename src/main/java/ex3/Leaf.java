package ex3;

import java.util.Set;

public class Leaf implements Tree {
    private Integer val;

    public Leaf(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean contains(Integer val) {
        return val.equals(this.val);
    }

    @Override
    public Set<Integer> values() {
        return Set.of(this.val);
    }

    @Override
    public Integer sum() {
        return this.val;
    }

    @Override
    public Integer min() {
        return this.val;
    }

    @Override
    public Integer max() {
        return this.val;
    }

    @Override
    public boolean isSorted() {
        return true;
    }
}
