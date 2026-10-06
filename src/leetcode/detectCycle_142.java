package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static leetcode.day5.buildList;

public class detectCycle_142 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("请输入数字，输入 -1 结束：");
        while(true){
            int nums=input.nextInt();
            if(nums==-1){
                break;
            }
            list.add(nums);
        }
        day5.ListNode head=buildList(list);
        day5.ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head.next;
        day5.ListNode slow=head;
        day5.ListNode fast=head;
        day5.ListNode p1=head,p2;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                p2=slow;
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
               System.out.println("找到了!");
                return;
            }

        }
        System.out.println("没找到!");
            return;

    }
}
