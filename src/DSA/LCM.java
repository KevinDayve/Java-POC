package DSA;

public class LCM {
    public static void main(String[] args) {
        System.out.println(Least(4, 8));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int Least(int n, int m) {
        return n * m / gcd(n, m);
    }
}