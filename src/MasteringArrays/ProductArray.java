package MasteringArrays;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] prefix = productExceptSelf(array);
        System.out.println(Arrays.toString(prefix));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length];

        Arrays.fill(array, 1);
        int prefixSum = 1, postFixSum = 1;

        for(int i = 0;  i < nums.length; i++){
            array[i] = prefixSum;
            prefixSum = nums[i] * prefixSum;
        }

        for(int j = nums.length - 1; j >= 0; j--){
            array[j] = array[j] * postFixSum;
            postFixSum = nums[j] * postFixSum;

        }
        return array;
    }

    public static int[] bruteForceProductExceptSelf(int[] nums) {
        int[] preFix = new int[nums.length];
        Arrays.fill(preFix, 1);
        preFix[0] = nums[0];

        for(int i = 0; i < nums.length; i++){
            for(int j  = 0; j < nums.length; j++){
                if(j != i){
                    preFix[i] = preFix[i] * nums[j];
                }
            }
        }
        return preFix;
    }
}
