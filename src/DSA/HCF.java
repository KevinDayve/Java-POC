package DSA;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int first = a.nextInt();
        int second = b.nextInt();
        System.out.println(NaiveGCD(first, second));
        System.out.println(Euclid(first, second));
    }

    static int NaiveGCD(int n, int m) {
        int result = Math.min(n, m);
        while (result > 0) {
            if (n % result == 0 &&
            m % result == 0) {
                break;
            }
            result --;
        }
        return result;
    }
    static int Euclid(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Euclid(b, a%b);
    }
}
