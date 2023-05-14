package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {12, 6, 4, 3, 10, 8, 9, 12, 2};
        int answer = search(arr, n);
        System.out.println(answer);
    }
    static int search(int[] arr, int n) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
