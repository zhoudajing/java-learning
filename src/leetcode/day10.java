package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class day10 {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            // 这里判断 token 是不是运算符
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                // 是：弹两个数，算完压回去
                int a=stack.pop();
                int b=stack.pop();
                switch(token){

                    case"+":
                        stack.push(a+b);

                        break;
                    case"-":
                        stack.push(b-a);

                        break;
                    case"*":
                        stack.push(a*b);

                        break;
                    case"/":
                        stack.push(b/a);

                        break;
                }
            }else{
                stack.push(Integer.parseInt(token));
            }

            // 不是：转成 int，压栈
        }

        return stack.pop();
    }
        public static void main(String[] args) {
            day10 d = new day10();
            String[] tokens = {"2", "1", "+", "3", "*"};
            System.out.println(d.evalRPN(tokens));
    }
}
