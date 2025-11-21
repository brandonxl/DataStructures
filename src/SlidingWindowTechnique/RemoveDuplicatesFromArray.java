package SlidingWindowTechnique;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};

        int length = removeDuplicates(array);
        System.out.println(length);
    }



public static int removeDuplicates(int[] array){
    int left = 1, right = 0;
    for(; left < array.length; left++){
        if(array[right] == array[left]){
            array[left] = 0;
        }
        else{
            array[right + 1] = array[left];
            right++;
        }
    }
    return  right + 1;
    }
}

