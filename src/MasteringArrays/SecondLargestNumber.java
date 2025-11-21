package MasteringArrays;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = {1,2,4,7,7,5,2,0};
        int[] mix = new int[2];

        int second = secondLargesNumber(array);
        mix = findSecondLargestAndSmallest(array);
        System.out.println(Arrays.toString(mix));
    }


    /*
     Esta respuesta deberia ser O(N)
     */
    private static int secondLargesNumber(int[] array) {
        int largestNumber = array[0]; //1
        int secondLargestNumber = Integer.MIN_VALUE; //-21341513

        for(int i = 1; i < array.length; i++){ //i = 6
           if(array[i] > largestNumber){ /// 5 > 7
               secondLargestNumber = largestNumber; //4
               largestNumber = array[i]; //7
           }

           if(array[i] > secondLargestNumber && array[i] < largestNumber){ //5 < 7 && 5 != 7
               secondLargestNumber = array[i];
           }
        }
        return secondLargestNumber;
    }

    public static int[] findSecondLargestAndSmallest(int[] array){
        int secondLargestNumber = secondLargesNumber(array);
        int secondSmallestNumber = secondSmallestNumber(array);

        return new int[]{secondLargestNumber, secondSmallestNumber};
    }
    
    private static int secondSmallestNumber(int[] array) {

        int smallestNumber = array[0]; //1
        int secondSmallestNumber = Integer.MAX_VALUE;


        for(int i = 1; i < array.length; i++){ //i: 1
            if(array[i] < smallestNumber){ // 0 < 1
                secondSmallestNumber = smallestNumber; //1
                smallestNumber = array[i]; //0
            }else if(array[i] != smallestNumber && array[i] < secondSmallestNumber){
                secondSmallestNumber = array[i];
            }
        }
        return secondSmallestNumber;
    }
}
