package leetcode;
import java.util.Scanner;

public class day5 {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
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
            ListNode L1= buildList(new int[] {1,2,2,3,4,5});
            ListNode L2=buildList(new int[] {1,3,3,5,6});
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
        while(L1!=null && L2!=null){
            if(L1.val<=L2.val){
                cur.next=L1;
                L1=L1.next;
            }else{
                cur.next=L2;
                L2=L2.next;
            }
            cur=cur.next;
        }
        cur.next=(L1!=null)?L1:L2;
        printList(dummy.next);
    }

}
