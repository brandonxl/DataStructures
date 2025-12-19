package MonotonicStack;

import java.util.Stack;

public class MaximumWidthRamp962 {
    public static void main(String[] args) {
        int[] array = {9,8,1,0,1,9,4,0,4,1};
        int result = maxWidthRampBruteForce(array);
        int optimalResult = maxWidthRamp(array);
        System.out.println(result);
        System.out.println(optimalResult);

    }


    public static int maxWidthRampBruteForce(int[] nums) {

        int width = 0;
        int aux = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = + 1; j < nums.length; j++){
                if(nums[j] >= nums[i]){
                    aux = j - i;
                }

                if(aux > width){
                    width = aux;
                }
            }
        }

        return width;
    }

    public static int maxWidthRamp(int[] nums) {

        int width = 0;
        int aux = 0;
        int i = 0;
        int j = nums.length - 1;
        Stack<Integer> stack = new Stack<>();

        while(j > i){
            if(nums[j] < nums[i]){
                stack.push(nums[j]);
                j--;
            }else{
                width = j - i;
                break;
            }
        }

        while (j > i){
            if(!stack.isEmpty() && nums[i] < stack.peek()){
                width = Math.max(width, j - i);
            }else{
                stack.pop();
                i++;


            }
        }
        return width;
    }


}
