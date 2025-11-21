package TwoPointers;

import java.util.Locale;

public class ReverseWords {
    public static void main(String[] args) {
        String resultado  =reverseWords("the sky is       blue");
        System.out.println(resultado);
    }

    public static String reverseWords(String s) {

         String[] words= s.split("\\s+");

         StringBuilder sb = new StringBuilder();
         int index = words.length - 1;

        while(index >= 0){
                sb.append(words[index]);
                if (index != 0) {
                    sb.append(" ");
                }
            index--;
        }

        return sb.toString();
    }
}
