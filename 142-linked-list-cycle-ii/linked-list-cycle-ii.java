/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){return null;}
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast= fast.next.next;
            if(fast==slow)
            {
                break;
            }
            
        }
        if(fast==null || fast.next==null)
        {
            return null;
        }
        fast=head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}