package Array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] array = {4,12,5,3,1,2,5,3,1,2,4,6};
        nextElementBruteForce(array);

    }

    static int[] nextElementBruteForce(int[] nums){

        for(int i = 0 ; i < nums.length; i++){
            for(int j = i; j <nums.length; j++){
                if(nums[j] > nums[i]){
                    nums[i] = nums[j];
                    break;
                }else if(j == nums.length - 1 && nums[j] <= nums[i]){
                    nums[i] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    static int[] nextElementOptimalSolution(int[] nums){
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1; i <=0; i--){
            if(stack.isEmpty()){
                result[i] = -1;
                stack.push(nums[i]);
                continue;
            }


        }


        return result;
    }
}
