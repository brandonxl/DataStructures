package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3,3};
        int[] result = twoSumHashMapSolution(array, 6);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSumHashMapSolution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); //hashmap will store <value: key>
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int goal = 0;
            goal = target - nums[i];

            if(map.containsKey(goal)){
                result[0] = Math.min(i, map.get(goal));
                result[1] = Math.max(i, map.get(goal));
            }else{
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
