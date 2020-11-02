package ex3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node implements Tree {
    private List<Tree> children;

    public Node(List<Tree> children) {
        this.children = children;
    }

    @Override
    public int size() {
        int result = 0;
        for (final Tree child : children)
            result += child.size();
        return result;
    }

    @Override
    public boolean contains(Integer val) {
        boolean result = false;
        for (final Tree child : children)
            if (child.contains(val))
                result = true;
        return result;
    }

    @Override
    public Set<Integer> values() {
        Set<Integer> result = new HashSet<>();
        for (final Tree child : children)
            result.addAll(child.values());
        return result;
    }

    @Override
    public Integer sum() {
        int result = 0;
        for (final Tree child : children)
            result += child.sum();
        return result;
    }

    @Override
    public Integer min() {
        if (children == null || children.size() == 0)
            return null;
        int result = children.get(0).min();
        for (int i = 1; i < children.size(); ++i) {
            if (children.get(i).min() < result)
                result = children.get(i).min();
        }
        return result;
    }

    @Override
    public Integer max() {
        if (children == null || children.size() == 0)
            return null;
        int result = children.get(0).max();
        for (int i = 1; i < children.size(); ++i) {
            if (children.get(i).max() > result)
                result = children.get(i).max();
        }
        return result;
    }

    @Override
    public boolean isSorted() {
        return sortCondition1() && sortCondition2();
    }

    private boolean sortCondition1() {
        boolean result = true;
        for (Tree child : children) {
            if (!child.isSorted()) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean sortCondition2() {
        for (int i = 0; i < children.size(); ++i) {
            final Tree fi = children.get(i);
            final Tree fj = children.get(i + 1);
            if (fi.max() > fj.min())
                return false;
        }
        return true;
    }
}
