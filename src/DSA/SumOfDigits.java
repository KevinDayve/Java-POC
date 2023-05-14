package DSA;

public class SumOfDigits {
    public static void main(String[] args) {
        //System.out.println(Sum(253));
        System.out.println(NonRecursive(253));
    }
    static int Sum(int n) {
        if (n == 0) return 0;
        return Sum(n/10) + n % 10;
    }
    static int NonRecursive(int n) {
        int result = 0;
        while (n >= 0) {
            result = result + n % 10;
            n = n/10;
        }
        return result;
    }
}
