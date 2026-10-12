package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

        public MinStack() {
            stack =new ArrayDeque<>();
            minStack =new ArrayDeque<>();
        }

        public void push(int value) {
            stack.push(value);
            if(minStack.isEmpty()) minStack.push(value);
            else minStack.push(Math.min(minStack.peek(),value));
        }

        public void pop() {
            if(!stack.isEmpty()){ stack.pop();
            minStack.pop();}
            else{return;}
        }

        public int top() {
        return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

