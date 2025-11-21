package MasteringArrays;

import java.util.HashSet;

public class RepeatedNumber {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        boolean flag = isRepeatedBruteForce(array);
        boolean flag2 = isRepeated(array);
        System.out.println(flag);
        System.out.println(flag2);
    }

    static boolean isRepeatedBruteForce(int[] nums){

        for(int i = 0 ; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isRepeated(int[] nums){
        HashSet<Integer> hashSetNumbers = new HashSet<>();
        for(int num : nums){
            if(hashSetNumbers.contains(num)){
                return true;
            }
            hashSetNumbers.add(num);
        }
        return false;
    }
}
