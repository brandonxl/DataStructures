package Array;

import java.util.Arrays;

public class SquaresSortedArray977 {
    public static void main(String[] args) {
        int[] array = {-4,-1,0,3,10};
        int[] sorted = sortedSquares(array);

        System.out.println(Arrays.toString(sorted));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);

       return nums;
    }
}
