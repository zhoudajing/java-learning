package leetcode;

public class Day8 {
    public boolean isPalindrome(day5.ListNode head) {
        if (head == null || head.next == null) return true;

        // 1. 快慢指针找中点
        day5.ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. 反转后半段
        day5.ListNode secondHalf = reverse(slow.next);

        // 3. 比较
        day5.ListNode p1 = head, p2 = secondHalf;
        boolean result = true;
        while (p2 != null) {
            if (p1.val != p2.val) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4. 恢复链表（今天的新增动作）
        slow.next = reverse(secondHalf);

        return result;
    }

    private day5.ListNode reverse(day5.ListNode head) {
        day5.ListNode prev =null;
        while(head!=null){

            day5.ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
