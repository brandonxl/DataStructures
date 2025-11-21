package StackProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class GreaterElement {
    public static void main(String[] args) {
        int[] array = {2,1,5,6,2,3};
        int[] result = greaterElement(array);
        System.out.println(Arrays.toString(result));

    }


    static public int[] greaterElement(int[] array){
        int [] greaterElements = new int[array.length];
        Arrays.fill(greaterElements, - 1);
        Stack<Integer> stack = new Stack<>();
        for(int i = array.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && array[i] > stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                greaterElements[i] = stack.peek();
            }
            stack.push(array[i]);
        }
        return greaterElements;
    }
}
