package ex33;

public class MyString implements Summable<MyString>, Comparable<MyString>{
    String val;

    public MyString(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public MyString sum(MyString other) {
        return new MyString(this.val.concat(other.val));
    }

    @Override
    public MyString zero() {
        return new MyString("");
    }

    @Override
    public int compareTo(MyString other) {
        return this.val.compareTo(other.val);
    }
}
