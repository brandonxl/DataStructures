package MasteringArrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] array = {3,6,4,8,1,12,4,5};
       int largest =  findLargest(array);
        System.out.println(largest);
    }

    static public int findLargest(int[] array){
        int largestNumber = array[0];
        for (int j : array) {
            if (j > largestNumber) {
                largestNumber = j;
            }
        }
        return largestNumber;
    }
}
