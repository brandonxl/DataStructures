package StackProblems;

import java.util.Stack;

public class BackspaceString844 {
    public static void main(String[] args) {
        String s =  "abcd";
        String t = "abcd";

        boolean flag  =backspaceCompare(s,t);
        System.out.println(flag);
    }

    static public boolean backspaceCompare(String s, String t){

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
//        char a;
//        char b;
//        int pointer1 = 0;
//        int pointer2= 0;

//        boolean flag = false;
        int index = 0;


        int maxLengthString = Math.max(s.length(), t.length());
        System.out.println(maxLengthString);
        while (index < maxLengthString){
            if(index < s.length() && s.charAt(index) != '#'){
                stack1.push(s.charAt(index));
//                pointer1++;
            }else if(index < s.length() && s.charAt(index) == '#' && !stack1.isEmpty()){
                stack1.pop();
//                pointer1--;
            }

            if(index < t.length() && t.charAt(index) != '#'){
                stack2.push(t.charAt(index));
//                pointer2++;
            }else if(index < t.length() && t.charAt(index)  =='#' && !stack2.isEmpty()){
                stack2.pop();
//                pointer2--;
            }

//            if(!stack1.isEmpty() && !stack2.isEmpty()){
//                a = stack1.peek();
//                b = stack2.peek();
//                if(a == b && pointer1 == pointer2){
//                    flag = true;
//                }else{
//                    flag = false;
//                }
//            }
            index++;
        }
        if(stack1.isEmpty() && stack2.isEmpty()) return true;
        if(stack1.isEmpty() || stack2.isEmpty()) return false;
        return stack1.equals(stack2);
    }
}
