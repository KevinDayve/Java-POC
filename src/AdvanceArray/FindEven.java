package AdvanceArray;

public class FindEven {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(FindNumbers(nums));
    }
    static int FindNumbers(int[] nums) {
        int HowMany = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                digit++;
            }
            if (digit % 2 == 0) {
                HowMany++;
            }
        }
        return HowMany;
    }
}
