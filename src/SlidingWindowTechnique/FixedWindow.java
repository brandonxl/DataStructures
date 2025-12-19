package SlidingWindowTechnique;

public class FixedWindow {

    public int findKSubString(int[] array, int k){

        int value = Integer.MIN_VALUE;
        int currentSum = 0;

        //inicializamos nustra primera ventana
        for(int i = 0;  i < k; i++){
            currentSum += array[i];
        }

        //iniciamos a iterar nustra ventana empezando desde el siguiente elemento de k

        value = currentSum;
        //{8,2,4,10,3,1,0}
        for(int i = k; i < array.length; i++){
            currentSum+= array[i] - array[i - k];
            value = Math.max(value, currentSum);
        }
        return value;
    }

    



    public static void main(String[] args) {
        FixedWindow fixWindow = new FixedWindow();

        int[] myArray = {8,2,4,10,3,1,0};

        int resultado = fixWindow.findKSubString(myArray, 3);
        System.out.println(resultado);
    }
}
