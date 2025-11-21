package Array;

public class CanPlaceFlowers605 {
    public static void main(String[] args) {
        int[] array = {0,0,0,0,1};
           boolean isPossible = canPlaceFlowers(array, 1);
        System.out.println(isPossible);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {


        if(flowerbed.length == 0) return true;
        int plotsPlaned = 0;


        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                plotsPlaned++;

                if(plotsPlaned == n){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
