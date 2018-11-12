package com.rsouza01.google.stack;

public class Stack {
	
    private int top = -1;

    private int length = -1;

    private long[] stack = null;


    public Stack(int length) {
        this.length = length;
        this.stack = new long[length];
    }

    public void push(long value) {
        if(!this.isFull()) {
            top++;
            this.stack[top] = value;
        }
    }

    public long pop() {
        if(!this.isEmpty()) {
            int oldTop = top;
            top--;
            return this.stack[oldTop];
        } else return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == this.length -1);
    }
}
