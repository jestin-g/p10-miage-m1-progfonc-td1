package ex1;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "un");
        Pair<Double, String> p2 = new Pair<>(1.0, "un");
        Pair<Double, Pair> p3 = new Pair<>(1.0, p2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
