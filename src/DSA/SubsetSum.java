package DSA;

public class SubsetSum {
    public static void main(String[] args) {

    }
    static int combinations(int[] arr, int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return combinations(arr, n-1, sum) + combinations(arr, n-1, sum-arr[n-1]);
    }
}
