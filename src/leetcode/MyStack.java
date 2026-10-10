package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
     private Queue<Integer> inqueue;

    public MyStack() {
        inqueue=new LinkedList<>();
    }

    public void push(int x) {
        inqueue.offer(x);
        int i=inqueue.size();
        for(int j=0;j<i-1;j++){
            inqueue.offer(inqueue.poll());
        }

    }

    public int pop() {
        return inqueue.poll();
    }

    public int top() {
        return inqueue.peek();
    }

    public boolean empty() {
        return  inqueue.isEmpty();
    }
}
