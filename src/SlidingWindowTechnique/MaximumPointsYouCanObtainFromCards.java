package SlidingWindowTechnique;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] array = {1,1000,1};
        int k = 1;
        int result = maxScore(array, k);
        System.out.println(result);

    }


    public static int maxScore(int[] cardPoints, int k) {
        int maxSum = 0;
        int sum = 0;
        int startingPoint = cardPoints.length - k;
        int lastIndex = cardPoints.length;


        //here im initializing my window
        for(int i = startingPoint; i < cardPoints.length; i++){
            sum += cardPoints[i];
        }
        maxSum = Math.max(maxSum, sum);

        //here im returing right away if k == cardPoints.length
        if(cardPoints.length == k) return maxSum;

        while(true){
            sum -= cardPoints[startingPoint % cardPoints.length];
            startingPoint++;
            if(startingPoint % cardPoints.length == 1) break;
            sum += cardPoints[lastIndex++ % cardPoints.length];
            maxSum = Math.max(maxSum, sum);
        }


        return maxSum;
    }
}
