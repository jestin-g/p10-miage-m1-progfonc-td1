package ex32;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node<T> implements Tree<T> {
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
}
