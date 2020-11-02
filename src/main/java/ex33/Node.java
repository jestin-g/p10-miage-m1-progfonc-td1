package ex33;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node<T extends Summable<T> & Comparable<T>> implements Tree<T> {
    private List<Tree<T>> children;

    public Node(List<Tree<T>> children) {
        this.children = children;
    }

    @Override
    public int size() {
        int result = 0;
        for (final Tree<T> child : children)
            result += child.size();
        return result;
    }

    @Override
    public boolean contains(T val) {
        boolean result = false;
        for (final Tree<T> child : children)
            if (child.contains(val))
                result = true;
        return result;
    }

    @Override
    public Set<T> values() {
        Set<T> result = new HashSet<>();
        for (final Tree<T> child : children)
            result.addAll(child.values());
        return result;
    }

    @Override
    public T sum() {
        if (children == null || children.size() == 0)
            return null;
        T result = children.get(0).sum();
        for (int i = 1; i < children.size(); i++) {
            result = result.sum(children.get(i).sum());
        }
        return result;
    }

    @Override
    public T min() {
        if (children == null | children.size() == 0)
            return null;
        T result = children.get(0).min();
        for (int i = 1; i < children.size(); i++) {
            T min = children.get(i).min();
            if (min.compareTo(result) < 0)
                result = min;
        }
        return result;
    }

    @Override
    public T max() {
        if (children == null | children.size() == 0)
            return null;
        T result = children.get(0).min();
        for (int i = 1; i < children.size(); i++) {
            T min = children.get(i).min();
            if (min.compareTo(result) > 0)
                result = min;
        }
        return result;    }

    @Override
    public boolean isSorted() {
        return false;
    }

}
