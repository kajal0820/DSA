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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;

        while(current!=null &&current.next!=null){
                       if (current.val == current.next.val) {
                // Skip the next node if it's a duplicate
                current.next = current.next.next;
            } else {
                // Move to next node if no duplicate
                current = current.next;
            }
        }
        
        return head;
    }
}
