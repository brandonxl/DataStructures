package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {
    public static void main(String[] args) {


        int[] array = {1,2,5,2,3};

        System.out.println(targetIndices(array, 2));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();

        Arrays.sort(nums);

        int lowestIndex = findLowestIndex(nums, target);
        int highestIndex = findHighestIndex(nums,target);

        if(lowestIndex == -1 || highestIndex == -1) return indices;
        if(lowestIndex != highestIndex){
            for(int i = lowestIndex; i <= highestIndex; i++){
                indices.add(i);
            }
        }else{
            indices.add(lowestIndex);
        }


        return indices;
    }

    public static int findLowestIndex(int[] array, int target){

        int low = 0, high = array.length - 1;
        int lowestIndex = -1;

        while(high >= low){
            int mid = low + (high - low) / 2;

            if(array[mid] == target){
                lowestIndex = mid;
                high = mid -1;
            } else if(array[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return lowestIndex;
    }


    public static int findHighestIndex(int[] array, int target){
        int low = 0, high = array.length -1;
        int highestIndex = -1;

        while(high >= low){
            int mid = low + (high - low) / 2;
            if(array[mid] == target){
                highestIndex = mid;
                low = low  + 1;
            }

            else if(array[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return highestIndex;
    }


}
