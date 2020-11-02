package ex33;

import java.util.Objects;

public class MyInteger implements Summable<MyInteger>, Comparable<MyInteger> {
    Integer val;

    public MyInteger(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    @Override
    public MyInteger sum(MyInteger other) {
        return new MyInteger(this.val + other.val);
    }

    @Override
    public MyInteger zero() {
        return new MyInteger(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return Objects.equals(val, myInteger.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
    public int compareTo(MyInteger other) {
        return this.val.compareTo(other.val);
    }
}
