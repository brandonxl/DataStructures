package MasteringArrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <= k; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                return map.containsKey(nums[i]);
            }
        }

        return false;
    }
}
