package ex3;

import java.util.ArrayList;
import java.util.Set;

public class Node implements Tree {
    private ArrayList<Tree> children;

    public Node(ArrayList<Tree> children) {
        this.children = children;
    }

    @Override
    public int size() {
        int size = 0;
        for (Tree child : children) {
            size += child.size();
        }
        return size;
    }

    @Override
    public boolean contains(Integer val) {
        for (Tree child : children) {
            return child.contains(val);
        }
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
