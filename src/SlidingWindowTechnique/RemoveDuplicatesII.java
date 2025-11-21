package SlidingWindowTechnique;

import com.sun.jdi.PathSearchingVirtualMachine;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,2,2,2,3};
        int length  = removeDuplicates(array);
        System.out.println(length);

    }



    public static int removeDuplicates(int[] nums) {
        int maxAllowedRepeatNumber = 0;
        int left = 0 , right = 0;
        int currentSortNumber = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(currentSortNumber  == nums[i] && maxAllowedRepeatNumber < 2){
                maxAllowedRepeatNumber++;
                left++;
                right++;
            }else if(currentSortNumber == nums[i]){
                nums[i] = 0;
                left++;
            }else{
                maxAllowedRepeatNumber = 1;
                currentSortNumber++;
                nums[right] = nums[left];
                right++;
            }
        }

        return 0;
    }
}
