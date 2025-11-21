package StackProblems;

import java.util.Set;
import java.util.Stack;

public class PolishNotacion150 {
    public static void main(String[] args) {

        String[] array = {"4", "3", "-"};
        evalRPN(array);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operadores = Set.of("+", "*", "-", "/");
        int index = 0;

        while(index < tokens.length){
            if(!operadores.contains(tokens[index])){
                int value = Integer.parseInt(tokens[index]);
                stack.push(value);
                System.out.println("elementeo agregado: " + stack.peek());
            }else{
                String operator = tokens[index];

                switch (operator){
                    case "+" :
                        if(!stack.isEmpty() && stack.size() > 1){
                            int popLastElement = stack.pop();
                            int result = stack.peek() + popLastElement;
                            if(!stack.isEmpty()){
                                int popPeek = stack.pop();
                                stack.push(result);
                                System.out.println(stack.peek());
                            }
                        }
                        break;
                    case "-":
                        if(!stack.isEmpty() && stack.size() > 1){
                            int popLastElement = stack.pop();
                            int result = stack.peek() - popLastElement;
                            if(!stack.isEmpty()){
                                int popPeek = stack.pop();
                                stack.push(result);
                                System.out.println(stack.peek());
                            }
                        }
                    break;
                    case "*" :
                        if(!stack.isEmpty() && stack.size() > 1){
                            int popLastElement = stack.pop();
                            int result = stack.peek() * popLastElement;
                            if(!stack.isEmpty()){
                                int popPeek = stack.pop();
                                stack.push(result);
                                System.out.println(stack.peek());
                            }
                        }
                        break;
                    case "/":
                        if(!stack.isEmpty() && stack.size() > 1){
                            int popLastElement = stack.pop();
                            int result = stack.peek() / popLastElement;
                            System.out.println(result);
                            if(!stack.isEmpty()){
                                int popPeek = stack.pop();
                                stack.push(result);
                                System.out.println(stack.peek());
                            }
                        }
                        break;

                }
            }
            index++;
        }
        return stack.peek();
    }
}
