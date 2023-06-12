package AdvanceArray;

public class MinimumFlips {
    public static void main(String[] args) {

    }
    // Given a binary array, how many flips will be required
    // To flip all the elements to make them the same.
    static void flip(boolean[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                System.out.println("From" + i + "to");
            } else System.out.println(i - 1);
        }
        if (arr[arr.length - 1] != arr[0]) {
            System.out.println(arr.length-1);
        }
    }
}
