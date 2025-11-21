package BinarySearch;

//Introduction to Binary Search Algorithm
public class Problem01 {

    public static void main(String[] args) {
        int[] sortArray = {1,2,3,4,5,6};

        System.out.println("hola");
        System.out.println(binarySearch(sortArray,5));

//        binarySearch(sortArray, 5);
    }



    static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;


        while(high >= low){

            int middle = low + (high - low) / 2;

            if(target == array[middle]){
                return middle;
            }
            if(array[middle] > target){
                high = middle - 1;
            }else{
                low = middle  + 1;
            }

        }
        return -1;
    }


}
