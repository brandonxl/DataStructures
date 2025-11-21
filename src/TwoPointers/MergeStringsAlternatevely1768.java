package TwoPointers;

public class MergeStringsAlternatevely1768 {
    public static void main(String[] args) {
        String newWord = mergeAlternately("abcd", "pq");
        System.out.println(newWord);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int indice = 0;

//        int maxIndex = word1.length() > word2.length() ? word1.length() - 1 : word2.length() - 1;
        int maxIndex = Math.max(word1.length(), word2.length()) - 1;

        while (indice <= maxIndex){
            if(indice <= word1.length() - 1){
                sb.append(word1.charAt(indice));
            }

            if(indice <= word2.length() - 1){
                sb.append(word2.charAt(indice));
            }
            indice++;
        }



        return sb.toString();
    }
}
