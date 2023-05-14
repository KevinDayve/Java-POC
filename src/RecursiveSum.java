public class RecursiveSum {
    public static void main(String[] args) {
        // Print the sum of 5 to 1
        System.out.println(sumofdigits(1342));
    }

    static int sumofdigits(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + sumofdigits(n/10);
    }

    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
}
