package ex3;

import java.util.Set;

public class Leaf implements Tree {
    private Integer val;

    public Leaf(Integer val) {
        this.val = val;
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
        return null;
    }

    @Override
    public Integer sum() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean isSorted() {
        return false;
    }
}
