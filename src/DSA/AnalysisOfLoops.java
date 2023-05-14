package DSA;
public class AnalysisOfLoops {
    public static void main(String[] args) {
        recursion(20);
        int[] arr = {12, 1, 2, 5, 8, 7};
        int aux = 6;
        System.out.println(arrSum(arr, aux));
        System.out.println(function(6));
        System.out.println(fibo(10));
        System.out.println(fib(4));
    }
    static void recursion(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Kevin is learning DSA.");
        recursion(n / 2);
        recursion(n / 2);
    }

    static int arrSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    static int function(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + function(n - 1);
    }
    static int fibo(int n) {
        if (n == 0 | n == 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static int fib(int n) {
        if (n == 0 | n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


}