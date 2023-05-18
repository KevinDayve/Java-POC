package AdvanceArray;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println(secondlargest(arr));;
    }
    static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    static int largestindex(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }
    static int secondlargest(int[] arr) {
        int largest = 0;
        int secondlargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] < largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}
