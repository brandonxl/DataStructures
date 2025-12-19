package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepating3{
    public static void main(String[] args) {

        String s = "pwwkew";
        int result =  check(s);
        System.out.println(result);
    }

    static int check(String s){
        int maxCount = 0;
        int aux = 0;
        HashMap<Integer, Character> hashMap = new HashMap<>();
        int i = 0, j = 0;

        while(j < s.length()){
            if(!hashMap.containsValue(s.charAt(j))){
                hashMap.put(j, s.charAt(j));
                aux ++;
                if(aux > maxCount){
                    maxCount = aux;
                }
                j++;
            }else{
                hashMap.remove(i, s.charAt(i));
                aux--;
                i++;
                while(i < j){
                    if(hashMap.containsValue(s.charAt(j))){
                        hashMap.remove(i, s.charAt(i));
                        aux--;
                        i++;
                    }else{
                        hashMap.put(j, s.charAt(j));
                        aux++;
                        j++;
                        break;
                    }
                }
            }
        }
        return maxCount;
    }

    public static  int lengthOfLongestSubstring(String s) {
        int maxLength  = 0;
        Set<Character> longestSubstring = new HashSet<>();

        int j = 0;
        while(j < s.length()){
            if(!longestSubstring.contains(s.charAt(j))){
                longestSubstring.add(s.charAt(j));
            }
            j++;
        }

        return maxLength;
    }
}
