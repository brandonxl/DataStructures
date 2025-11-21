package StackProblems;

import java.util.EmptyStackException;

public class CustomStack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
     int pointer = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.stack = new int[size];
    }

    public boolean pushElement(int element){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        stack[++pointer] = element;
        return true;
    }

    public int popElement() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot pop from an empty stack");
        }
        return stack[pointer--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot peek from an empty stack");
        }
        return stack[pointer];
    }

    public boolean isFull() {
        return pointer == stack.length - 1;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }
}
