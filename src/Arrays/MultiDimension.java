package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    /*
    1 2 3
    4 5 6
    7 8 9
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row.
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        int[][] arr2 = {
                {1,2},
                {3,4},
                {5,6}
        };
        for (int[] a: arr2) {
            System.out.println(Arrays.toString(a));
        }

    }
}
