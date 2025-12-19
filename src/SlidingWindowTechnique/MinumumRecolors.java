package SlidingWindowTechnique;

public class MinumumRecolors {
    public static void main(String[] args) {

        String s = "WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW";
        int a = Integer.MAX_VALUE;
        int k = 15;
        int result = minimumRecolors(s, k);
        System.out.println(result);

    }

    public static int minimumRecolors(String blocks, int k) {
        int countChanges = 0;
        int minCount = Integer.MAX_VALUE;
        int leftWindow = 0;

        //here im initializing my window to the size k since k is the optimal consecutives k number
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                countChanges++;
            }
        }
        minCount = Math.min(countChanges, minCount);

        for(int i = k; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                countChanges++;
            }

            if(blocks.charAt(leftWindow++) == 'W'){
                countChanges--;
            }

            minCount = Math.min(countChanges, minCount);
        }

        return minCount;
    }
}
