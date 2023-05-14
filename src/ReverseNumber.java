public class ReverseNumber {
    static int sum = 0;
    static void reverse(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

    static int reverse2(int n){
        //Sometimes, you may need additional variables in the argument.
        // in that case, make another function.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int remainder = n % 10;
        return remainder * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        //System.out.println(reverse2(1234));
        System.out.println((int)Math.log10(1234) + 1);
    }
}
