package TwoPointers;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] array = {1,1};
        int maxTotal = maxArea(array);
        System.out.println(maxTotal);

    }

    public static int maxArea(int[] height) {
        int left = 0, rigth = height.length - 1;
        int mostWater = 0;
        int areaTotal = 0;


        while(rigth > left){
            int width = rigth - left;
            int length = Math.min(height[left], height[rigth]);
            areaTotal =  width * length;

            if(areaTotal > mostWater){
                mostWater = areaTotal;
            }

            if(height[left] < height[rigth]){
                left++;
            }else{
                rigth--;
            }

        }
        return mostWater ;
    }
}
