package TwoPointers;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        //problem 344
        char[] c = {'h','e','l','o'};
        String s = "helo";

        reverseString(c);
        reverseVowels(s);


    }


    public static void reverseString(char[] s) {

        int left = 0, rigth = s.length - 1;

        while(rigth > left){
            char auxForLeft = s[left];
            s[left] = s[rigth];
            s[rigth] = auxForLeft;

            rigth--;
            left++;
        }

        System.out.println(Arrays.toString(s));
    }

    public static void reverseVowels(String c){

        char[] s = c.toCharArray();
        int left = 0, right = s.length - 1;

        while(right > left){
            boolean isVowelLeft = "aeiouAEIOU".indexOf(s[left] ) != - 1;
            boolean isVowelRight = "aeiouAEIOU".indexOf(s[right]) != - 1;

            if(!isVowelLeft) left++;
            if(!isVowelRight) right--;

            if(isVowelLeft && isVowelRight){
                char aux = s[left];
                s[left] = s[right];
                s[right] = aux;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(s));
    }
}
