package SlidingWindowTechnique;

public class LongestSubarrayof1_1493 {
    public static void main(String[] args) {
        int[] array = {1,1,1};
        int result = longestSubarray(array);
        System.out.println(result);

    }

    public static int longestSubarray(int[] nums) {

        int remainingSkips = 1;
        int count = 0;
        int maxTotal = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            while(remainingSkips == 0 && nums[right] == 0){
                if(nums[left] == 1){
                    count--;
                }else{
                    remainingSkips++;
                }
                left++;
            }

            if(nums[right] == 1){

                maxTotal = Math.max(maxTotal, right - left);
            }else{
                remainingSkips--;
            }
        }

        if(maxTotal == nums.length) return maxTotal - 1;

        return maxTotal;

    }
}
