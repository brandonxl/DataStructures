package SlidingWindowTechnique;

import java.util.HashSet;

public class MaximumSumOfDistinctSubArrays2461 {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        long result = maximumSubarraySum(nums,k);
        System.out.println(result);


    }

    /*this was originally solution, but failed on 91 test out of 93
//despite the fact this logic achieves a very similar solution, the best one is just to keep the allow window
//            if(validNumber > k){
//                sum -= nums[left++];
//                validNumber--;
//            }
//            if(validNumber == k){
//                answer = Math.max(answer, sum);
*/

    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int answer = Integer.MIN_VALUE;
//        int validNumber = 0;
        int sum = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            while(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left++]);
//                validNumber--;
            }

                set.add(nums[right]);
                sum += nums[right];
//                validNumber++;

            if(right + 1 - left > k){
                sum -= nums[left];
                set.remove(nums[left++]);
            }

            if(right + 1 - left == k){
                answer = Math.max(answer, sum);
            }
        }
        return answer;
    }
}

