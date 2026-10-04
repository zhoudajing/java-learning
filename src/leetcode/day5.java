package leetcode;
import java.util.Scanner;
import java.util.ArrayList;
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
    public static ListNode buildList(ArrayList<Integer> arr) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int num : arr) { // 增强for循环对 ArrayList 也适用
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }
    public static ListNode mergeTwoLists(ListNode L1, ListNode L2){
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
        return dummy.next;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("请输入数字，输入 -1 结束：");
        while (true) {
            int num = input.nextInt();
            if (num == -1) {
                break; // 输入 -1 就跳出循环
            }
            nums.add(num); // 把数字装进购物袋
        }

            ListNode L1= buildList(nums);
            ListNode L2=buildList(new int[] {1,3,3,5,6});
            ListNode result=mergeTwoLists(L1,L2);
        printList(result);
    }

}
