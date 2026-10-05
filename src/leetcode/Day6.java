package leetcode;
import java.util.Scanner;
public class Day6 {
    static class  ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode buildList(int[] arr){
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        for(int num:arr){
            cur.next=new ListNode(num);
            cur=cur.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1=buildList(new int[] {1,2,3,4,5,2});
        ListNode slow=l1;
        ListNode fast=l1;
        while(fast.next!=null&&fast.next.next!=null){
            if(fast==slow){
                System.out.println("OK");
                return;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("NO");

    }

  }

