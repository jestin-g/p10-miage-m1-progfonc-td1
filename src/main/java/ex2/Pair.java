package ex2;

public class Pair<A, B> {
    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public <C> Pair<C, B> changeFirst(C val) {
        return new Pair<>(val, this.second);
    }

    public <C> Pair<A, C> changeSecond(C val) {
        return new Pair<>(this.first, val);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ") :: Pair[" + first.getClass().getSimpleName() + ", " + second.getClass().getSimpleName() + "]";
    }

}