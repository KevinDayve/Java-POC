package DSA;

public class Test {
    public static void main(String[] args) {
        greet(3);
    }
    static void greet(int n) {
        if (n == 0 || n < 0) return;
        System.out.println("This is recursion");
        greet(n-1);
    }
}
