package Hash;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "LVIII";

        int result = romanToInt(s);
        System.out.println(result);

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int answer= 0;
        char currentLetter = s.charAt(s.length()- 1); //v
        int repeatLetter = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(currentLetter != s.charAt(i)){
                currentLetter = s.charAt(i);
                repeatLetter = 1;
            }else{
                repeatLetter++;
            }

            if(repeatLetter > 1 || hashMap.get(s.charAt(i)) > answer ){
                answer = answer  + hashMap.get(s.charAt(i));
            }else{
                answer = answer - hashMap.get(s.charAt(i));

            }
        }

        return answer;
    }


}
