package DSA;

public class Bits {
    public static void main(String[] args) {
        System.out.println(SetOrNot(5, 10));
    }
    static boolean SetOrNot(int n, int k) {
        return (n & (1 << (k - 1))) == 1;
    }
}