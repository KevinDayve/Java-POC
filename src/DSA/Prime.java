package DSA;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        int number = 11;
        boolean answer = isPrime(number);
        System.out.println(answer);
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 | n == 3) {
            return true;
        }
        if (n % 2 == 0 | n % 3 == 0) {
            return false;
        }
        return IntStream.iterate(5, i -> i * i <= n, i -> i + 6).noneMatch(i -> true);
    }
}
