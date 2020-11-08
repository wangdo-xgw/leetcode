package com.aisino.stackQueue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidKuoHao {
    public boolean isValid(String s){
        int n = s.length();
        if(n % 2==1){
            return false;
        }
        Map<Character,Character> pairs = new HashMap<Character, Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};
        /**
         *双端队列(两端都可进出)
         *Deque deque = new LinkedList()
         *Java堆栈Stack类已经过时，Java官方推荐使用Deque替代Stack使用。Deque堆栈操作方法：push()、pop()、peek()。
         */
        Deque<Character> stack = new LinkedList<Character>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)){
                if(stack.isEmpty()||stack.peek()!=pairs.get(ch)){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]){
        String s = "{[()]}";
        ValidKuoHao solution = new ValidKuoHao();
        boolean b = solution.isValid(s);
        System.out.println(b);
    }
}
