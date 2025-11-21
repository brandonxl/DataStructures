package SlidingWindowTechnique;

public class PalindromeSentence {
    public static void main(String[] args) {
        String str = "..";
        boolean flag = isPalindrome(str);
        System.out.println(flag);

    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[\\p{Punct}\\s]+", "");
        int left = 0, right = str.length() - 1;

        if (str.length() <= 1) return true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}