public class Zeros {
    public static void main(String[] args) {
        System.out.println(countzeros(30240));
    }

    static int countzeros(int n){
        return helper(n, 0);
    }
    static int helper(int n, int zero) {
        if (n == 0) {
            return zero;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, zero+1);
        }
        return helper(n/10, zero);
    }
}
