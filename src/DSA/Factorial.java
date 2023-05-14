package DSA;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(6);
        System.out.println(ans);
        int calc = 10;
        int zeros = countTrailingZeros(calc);
        System.out.println(zeros);
    }

    static int factorial(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; i < n; i = i * 5) {
            count = count + n / i;
        }

       return count;
    }
}
