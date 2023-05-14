package Recursion;
// Solve patterns through recursion.
public class BubbleRecursion {
    public static void main(String[] args) {
        pattern(4,0);
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            pattern(row, col + 1);
        } else {
            System.out.println();
            pattern(row-1, 0);
        }
    }

    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row-1, 0);
        }
    }

    static void selection(int[] arr, int row, int col, int max) {
        if (col > row) {

            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selection(arr,row-1,0, 0);
        }
    }
}
