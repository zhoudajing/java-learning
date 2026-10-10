package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class day9 {
    private Deque<Integer> inStack;
    private Deque<Integer> outStack;
    public day9() {
        inStack=new ArrayDeque<>();
        outStack=new ArrayDeque<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public int peek() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty()&&outStack.isEmpty();
    }
    public static void main(String[] args) {
        day9 q = new day9();
        q.push(1);
        q.push(2);
        System.out.println(q.peek());  // 期望 1
        System.out.println(q.pop());   // 期望 1
        System.out.println(q.empty()); // 期望 false
        System.out.println(q.pop());   // 期望 2
        System.out.println(q.empty()); // 期望 true
    }
}
