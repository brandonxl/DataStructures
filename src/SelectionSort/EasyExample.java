package SelectionSort;

import java.util.Arrays;

public class EasyExample {
    public static void main(String[] args) {

        int[] array = {8,14,3,99,4,55};

        int[] sortArray = sortArray(array);
        System.out.println(Arrays.toString(sortArray));

    }

    //sort an array by the smallest item to the biggest

    public static int[] sortArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int smallestValue = array[i];
            int smallestIndex = i;
            for(int j = i  + 1; j < array.length; j++){
                if(array[j] < smallestValue){
                    smallestValue = array[j];
                    smallestIndex = j;
                }

            }
            swap(array, i, smallestIndex);

        }
        return array;
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }
}
