package TwoPointers;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(array)));
    }

    public static int[] duplicateZeros(int[] arr) {

        int duplicateValidZeros = 0;
        int validLength = 0;
        int n = arr.length;

        // Paso 1: contar ceros válidos
        for (int i = 0; i < n - duplicateValidZeros; i++) {
            if (arr[i] == 0) {
                // Caso especial: el último cero que solo cabe una vez
                if (i == n - 1 - duplicateValidZeros) {
                    arr[n - 1] = 0;
                    n--; // reducimos el tamaño efectivo
                    break;
                }
                duplicateValidZeros++;
                validLength += 2;
            } else {
                validLength++;
            }
        }

        for (int i = n - 1 - duplicateValidZeros; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + duplicateValidZeros] = 0;
                duplicateValidZeros--;
                arr[i + duplicateValidZeros] = 0;
            } else {
                arr[i + duplicateValidZeros] = arr[i];
            }
        }
        return arr;
    }
}
