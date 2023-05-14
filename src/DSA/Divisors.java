package DSA;

public class Divisors {
    public static void main(String[] args) {
        efficient(10);
    }

    static void divisors (int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static void efficient(int n) {
        for (int i = 1; i * i <= n; i++){
            if (n % i ==0) {
                System.out.println(i);
                if (i != n/i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    static void more(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i>=1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

}
