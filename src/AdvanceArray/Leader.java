package AdvanceArray;

public class Leader {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leader(arr);
    }
    //O(n^2) solution
    static void leader(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(arr[i]);
            }
        }
    }
    static void EfficientLeader(int[] arr) {
        int curr_leader = arr[arr.length - 1];
        System.out.println(curr_leader);
        for (int i = arr.length-2; i>=0; i--) {
            if (curr_leader < arr[i]) {
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }
}
