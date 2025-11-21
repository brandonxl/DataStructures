package TwoPointers;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] array = {-5,-3,-2,-1};
        int[] sorted = sortedSquares(array);
        System.out.println(Arrays.toString(sorted));

    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(right >= left){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                int aux = nums[right];
                nums[right] = nums[left]  * nums[left];
                nums[left] = aux;
                right--;
            }else{
                nums[right] = nums[right] * nums[right];
                right--;
            }
        }
        return nums;
    }
}
