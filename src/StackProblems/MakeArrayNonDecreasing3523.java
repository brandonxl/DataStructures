package StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class MakeArrayNonDecreasing3523 {

    public static void main(String[] args) {
        int[] nums = {4,2,5,3,5};
        int result = maximumPossibleSize(nums);
        int result2 = maximumPossibleSizeOptimal(nums);
        System.out.println(result);
        System.out.println(result2);

    }

    static public int maximumPossibleSize(int[] nums){
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < nums.length; i++){

            if(stack.isEmpty()){
                stack.push(nums[i]);
                continue;

            }
            if(stack.peek() <= nums[i] ){
                stack.push(nums[i]);
            }

        }
        return stack.size();
    }

    static public int maximumPossibleSizeOptimal(int[] nums){

        int currentBiggestNumber = nums[0];
        int length =  1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= currentBiggestNumber){
                currentBiggestNumber = nums[i];
                length++;
            }
        }
        return length;
    }
}
