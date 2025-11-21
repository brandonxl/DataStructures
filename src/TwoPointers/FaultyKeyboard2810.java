package TwoPointers;


//TASK

import java.awt.image.CropImageFilter;
import java.util.Arrays;

/*
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.
 */
public class FaultyKeyboard2810 {
    public static void main(String[] args) {
        String faultyKeyword = finalString("string");
        System.out.println(faultyKeyword);

    }



//    public static String finalString(String s){
//        char[] characters = s.toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        int consecutiveI = 0;
//        int pointer1 = 0, pointer2 = 0;
//
//        while(pointer2 < characters.length - 1){
//            if(characters[pointer2] != 'i') consecutiveI = 0;
//
//
//
//            if(characters[pointer2] == 'i'){
//                consecutiveI++;
//                int currentIndexWhenFindI = pointer2;
//                pointer2 -= consecutiveI;
//                while(pointer2 > pointer1){
//                    char aux = characters[pointer2];
//                    characters[pointer2] = characters[pointer1];
//                    characters[pointer1] = aux;
//                    pointer1++;
//                    pointer2--;
//                }
//
//
//                if(consecutiveI == 0 && characters[pointer2] != 'i'){
//                    pointer1 = currentIndexWhenFindI + 1;
//                }
////
//                pointer2 = currentIndexWhenFindI + 1;
//                continue;
//            }
//            pointer2++;
//        }
//        for(int i = 0; i <= characters.length - 1; i++){
//            if(characters[i] != 'i'){
//                sb.append(characters[i]);
//            }
//        }
//        return sb.toString();
//    }

    public static  String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <= s.length() - 1; i ++){
            if(s.charAt(i) != 'i'){
                sb.append(s.charAt(i));
            }else{
                reverseString(sb);
            }
        }
        return sb.toString();

    }

    public static StringBuilder reverseString(StringBuilder s) {
        int left = 0, rigth = s.length() -1 ;
        while(rigth > left){
            char aux = s.charAt(rigth);
            s.setCharAt(rigth , s.charAt(left));
            s.setCharAt(left, aux);
            left++;
            rigth--;
        }
        return s;
        }
}
