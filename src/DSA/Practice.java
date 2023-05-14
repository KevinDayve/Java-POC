package DSA;

public class Practice {
    public static void main(String[] args) {
        TowerOfHanoi(2, 'A', 'B', 'C');
    }
    static void function(int n) {
        if (n == 0) {
            return;
        }
        function(n-1);
        System.out.println(n);
        function(n-1);
    }
    static int Logbase2(int n) {
        //Returns Log of n when Log base 2n. i.e
        //n is a power of two
        if (n == 1) {
            return 0;
        } else return (1 + Logbase2(n / 2));
    }
    static void ConvertToBinary(int n) {
        if (n == 0) return;
        ConvertToBinary(n/2);
        System.out.print(n % 2);
    }
    static void NtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        NtoOne(n-1);
    }
    static void OneToN(int n) {
        if (n == 0) {
            return;
        }
        OneToN(n - 1);
        System.out.print(n + " ");
    }
    static int factorial(int n, int k) {
        // Making it tail recursive
        if (n == 0 | n == 1) {
            return k;
        }
        return factorial(n-1, k * n);
    }
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static int natural(int n) {
        if (n <= 1) {
            return n;
        }
        return n + natural(n-1);
    }
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (s.charAt(start) == s.charAt(end)) && isPalindrome(s, start+1, end-1);
    }
    static void TowerOfHanoi(int n, char A, char B, char C) {
        if (n > 0) {
            TowerOfHanoi(n-1, A, C, B);
            System.out.println("Move a disc from " +A+ " to " +C);
            TowerOfHanoi(n-1, B, A, C);
        }
    }
}