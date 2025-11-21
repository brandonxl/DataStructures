package TwoPointers;

import java.util.Arrays;

public class InputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};

        int[] answer;

        answer = twoSum(numbers, 6);
        System.out.println(Arrays.toString(answer));
    }


    static public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length < 2) return null;

        int[] array = new int[2];
        int front = 0, back = numbers.length - 1;


        while(back > front){
            int sum = numbers[front] + numbers[back];
            if(sum == target){
                //adding one because the problem ask for an index >= 1 and an index <= than numbers.length
                return new int[]{front + 1, back + 1};
            }
            if(sum > target){
                back--;
            }else{
                front++;
            }
        }
        return null;
    }
}
