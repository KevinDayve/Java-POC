package DSA;
import java.io.*;
import java.util.*;
public class Sieve {
    public static void main(String[] args) {
        eratosthenes(13);
    }
    static void eratosthenes(int n) {
        if (n <= 1) {
            return;
        }
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i<= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
