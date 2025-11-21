package StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures739 {
    public static void main(String[] args) {
        int[] temperatures = {89,62,70,58,47,47,46,76,100,70};

        int[] result = dailyTemperaturesBruteForce(temperatures);
//        System.out.println(Arrays.toString(result));

        int[] result2 = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result2));

    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(result, 0);

        for(int i = temperatures.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                result[i] =  stack.peek() - i;
                

            }

            stack.push(i);
        }

        return result;

    }





    public static int[] dailyTemperaturesBruteForce(int[] temperatures){
        int[] answer = new int[temperatures.length];
        int currentTemperature = temperatures[0]; //73
        int index = 0;

        for(int i = 1; i < temperatures.length; i++){
            if(currentTemperature < temperatures[i]){
                answer[index] = i - index;
                index++; //2
                currentTemperature = temperatures[i]; //75
            }else{
                int i2 = i;
                while(i2 < temperatures.length){
                    if(currentTemperature > temperatures[i2]){
                        i2++;
                    }else{
                        answer[index] = i2 - index;
                        index++;
                        currentTemperature = temperatures[i];
                        break;
                    }

                    if(i2 == temperatures.length - 1 && temperatures[i2] < currentTemperature){
                        answer[index++] = 0;
                    }
                }
            }
        }
        return answer;
    }


}
