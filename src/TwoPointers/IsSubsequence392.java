package TwoPointers;

public class IsSubsequence392 {
    public static void main(String[] args) {
        String s = "abc";
        String f = "ahbgdc";
        boolean flag = isSubsequence(s,f);
        System.out.println(flag);

    }

    public static boolean isSubsequence(String s, String t) {

        if(s.isEmpty()) return true;
        boolean flag = false;

        int pointer1 = 0, pointer2 = 0;

        while(pointer2 < t.length()){


            if(s.charAt(pointer1) == t.charAt(pointer2)){
                flag = true;
                pointer1++;
                if(pointer1 == s.length()) return true;
            }else{
                flag = false;

            }
            pointer2++;
        }
        return false;

    }
}
