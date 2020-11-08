package com.aisino.stackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author: xuguangwu
 * @Description:
 * @date Created in 2020-10-27-下午 4:52
 */
public class TwoQueueToStack {
    /** Initialize your data structure here. */
    Deque<Integer> queue1;
    Deque<Integer> queue2;
    public TwoQueueToStack() {
        this.queue1 = new ArrayDeque<Integer>();
        this.queue2 = new ArrayDeque<Integer>();
    }
    /** Push element x onto stack. */
    public void push(int x) {
        //添加的时候，先将1的元素加入2，添加至1后在将2元素加至1
        while(!queue1.isEmpty()){//只要queue1不为空，就把q1的元素挨个放到q2中
            queue2.addLast(queue1.poll());   //poll方法--移除并返回队头元素。
        }
        queue1.addLast(x);
        while(!queue2.isEmpty()) {//？？？？？？？只要queue2不为空，就把q2的元素挨个放到q1中，此处不是很理解？？
            queue1.addLast(queue2.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue1.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        TwoQueueToStack tws = new TwoQueueToStack();
        tws.push(1);
        tws.push(2);
        tws.push(3);

    }

}
