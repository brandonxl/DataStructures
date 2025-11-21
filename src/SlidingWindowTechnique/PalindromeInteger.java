package SlidingWindowTechnique;

public class PalindromeInteger {
    public static void main(String[] args) {
    int palindrome = -121;

        System.out.println(isPalindrome(palindrome));


    }


    public static boolean isPalindrome(int x) {

        String str = Integer.toString(x);
        int left = 0;
        int right  = str.length() - 1;
        boolean flag = false;

        if(str.charAt(0) == '-') return false;
        if(str.length() == 1) return true;

        while(right > left){
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }else{
                flag = true;
            }
            left++;
            right --;
        }
        return flag;
    }
}
