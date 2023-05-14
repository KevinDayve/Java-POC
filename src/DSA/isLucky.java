package DSA;

public class isLucky {
    public static void main(String[] args) {
        System.out.println(isLucky(19));
    }
    static boolean isLucky(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
            n -= n/i;
        }
        return true;
    }
}
