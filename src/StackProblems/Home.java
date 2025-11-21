package StackProblems;

public class Home {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);

        stack.pushElement(10);
        stack.pushElement(21);

        System.out.println(stack.peek());

    }
}
