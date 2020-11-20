package com.aisino.stackQueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * //设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 */
public class MinStack {
    //Integer的范围  -2147483648 >= int<= 2147483647。
    Deque<Integer> xStack;
    Deque<Integer> minStack;
    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x){
        xStack.push(x);
        minStack.push(Integer.min(Integer.MAX_VALUE,x));
    }
    public void pop(){
        xStack.pop();
        minStack.pop();
    }
    public int top(){
        return xStack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

    }
}
