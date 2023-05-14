package DSA;

public class PowOfTwo {
    public static void main(String[] args) {
        System.out.println(check(4));
    }
    static boolean check(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n/2;
        }
        return true;
    }
    static boolean optimcheck(int n) {
        if (n == 0) {
            return false;
        }
        return ((n & (n-1)) == 0);
    }
}
