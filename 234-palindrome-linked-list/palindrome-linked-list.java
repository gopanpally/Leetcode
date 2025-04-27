/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        ListNode current = head;

        while(current!=null)
        {
            arr.add(current.val);
            current = current.next;
        }
        int first =0; 
        int last = arr.size()-1;
        while(first<=last)
        {
            if(arr.get(first)==arr.get(last))
            {
                first++;
                last--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}