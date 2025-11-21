package MasteringArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrama {
    public static void main(String[] args) {
       boolean flag = isAnagram("car", "arc");

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(str);
        System.out.println(result);

        System.out.println(flag);
    }

    public static boolean isAnagram(String s, String t) {
        int[] array = new int[26];

        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }

        for(int c : array){
            if(c != 0){
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        int[] characters = new int[26];
            for(int i = 0; i < strs.length; i++){
                Arrays.fill(characters,0);
                for(int j = 0; j < strs[i].length(); j++){
                    characters[strs[i].charAt(j) -'a']++;
                }

                StringBuilder sb = new StringBuilder();
                for(int k = 0; k < 26; k++){
                    sb.append("#");
                    sb.append(characters[k]);
                }

                String key = sb.toString();
                if(!map.containsKey(key)){
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(strs[i]);
        }

            return new ArrayList(map.values());
    }
}
