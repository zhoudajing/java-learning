package leetcode;
import java.util.Scanner;
public class day5 {
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
    public static void main(String[] args){
            ListNode L1= buildList();
        while()


    }

}
