package ex32;

import java.util.Set;

public interface Tree<T> {
    int size();
    boolean contains(final T val);
    Set<T> values();
}
