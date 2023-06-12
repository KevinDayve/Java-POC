package AdvanceArray;

public class Equilibrium {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 9, 7};
        System.out.println(EfficientEquilibrium(arr));
    }
    static boolean isEquilibrium(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lsum = 0;
            int rsum = 0;
            for (int j = 0; j < i; j++) {
                lsum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rsum += arr[k];
            }
            if (lsum == rsum) return true;
        }
        return false;
    }
    static boolean EfficientEquilibrium(int[] arr) {
        int rightsum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightsum += arr[i];
        }
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightsum -= arr[i];
            if (leftsum == rightsum) return true;
            leftsum += arr[i];
        }
        return false;
    }
}
