package DSA;

public class Asymptotic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 4};
        int answer = getSum(arr);
        int answer2 = oddSum(arr, 2);
        System.out.println(answer);
        System.out.println(answer2);
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static int oddSum(int[] arr, int n) {
        if (n % 2 == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
