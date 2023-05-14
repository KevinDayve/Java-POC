package DSA;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(3,2));
        System.out.println(optimised(3,5));
    }
    static int pow(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }
    static int optimised(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = optimised(x, n/2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
