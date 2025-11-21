package MasteringArrays;

public class LongestLengthSum {
    public static void main(String[] args) {
        int[] array ={2,7,3,10,10};
        int maxSum = 14;
       int longestLength  = findLongestLengthSum(array ,maxSum);
        System.out.println(longestLength);
    }


    static public int findLongestLengthSum(int[] array, int maxSum) {
        int maxLength= 0;
        int currentSum = 0;

        for(int first = 0, second = 0; first < array.length; first++){

            if(currentSum < maxSum){
                currentSum += array[first]; //22
                if(currentSum < maxSum){
                    maxLength++;
                }
            }

            if(currentSum > maxSum){
                currentSum -= array[second]; //22
                second++; //1
            }
        }

        return maxLength;
    }
}
