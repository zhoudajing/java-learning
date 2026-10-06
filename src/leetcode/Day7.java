package leetcode;

public class Day7 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode buildList(int[] arr){
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        for(int nums:arr){
            cur.next=new ListNode(nums);
            cur=cur.next;
        }
        return dummy.next;
    }

    public static ListNode halfreverse(ListNode head){


        ListNode prev =null;
        ListNode next;
        ListNode slow=head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        ListNode cur=slow;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;

    }


    public static void main(String[] args){
        int[] arr={1,2,3,2,5};
        ListNode l1=buildList(arr);
        ListNode l2=halfreverse(l1);
        for(int i=0;i<arr.length;i++){
            if(l1.val!=l2.val){
                System.out.print("NO");
                return ;
            }
        }
        System.out.print("ok");
    }
}
