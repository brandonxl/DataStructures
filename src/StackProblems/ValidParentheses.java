package StackProblems;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([}}])";
        isValid(s);

    }

    public static boolean isValid(String s) {

        Stack<Character> parentheses = new Stack<Character>();
        if(s.length() % 2 != 0) return false;

        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                parentheses.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && !parentheses.empty() && parentheses.peek() == '('){
                parentheses.pop();
            }else if(s.charAt(i) == '}' && !parentheses.empty() && parentheses.peek() == '{'){
                parentheses.pop();
            }else if(s.charAt(i) == ']' && !parentheses.empty() && parentheses.peek() == '['){
                parentheses.pop();
            }else{
                return false;
            }
        }

        return parentheses.isEmpty();
    }
}
