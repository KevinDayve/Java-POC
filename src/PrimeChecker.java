public class PrimeChecker {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println("Is " + i + " Prime" + ": " + isprime(i));
        }
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }

        int a = 2;
        while (a * a <= n) {
            if (n % a == 0) {
                return false;
            }
            a++;
        }

        return true;
    }
}
