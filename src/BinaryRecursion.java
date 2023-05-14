public class BinaryRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr, 5, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int middle = start + (end - start) / 2;

        if (arr[middle] == target){
            return middle;
        }

        if (target < arr[middle]){
            return search(arr, target, start, middle-1);
        }

        return search(arr, target, middle+1, end);
    }
}
