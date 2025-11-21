package SlidingWindowTechnique;

public class LongestSubarray {
    public static void main(String[] args) {

        int[] array = {2,4,8,2,1,0,5};
        int[] subArray = new int[2];
        int maxLength = findLongestArray(array,12);
        System.out.println(maxLength);
    }


    public static int findLongestArray(int[] array, int maxSum){
        int[] subArray = new int[2];
        int sum = 0, maxLength = 0, left = 0, right = 0;
        int firstIndex = 0, lastIndex = 0;
        int closestSum = array[right];

        while(right < array.length){
            sum = sum + array[right];
            while(sum > maxSum ){
                sum =  sum - array[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void showSubArray(int[] subArray){
        for(int i : subArray){
            System.out.println(i);
        }
    }

}
