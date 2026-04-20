class Solution {
    public ListNode reverseList(ListNode head) {

        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // reverse rest of the list
        ListNode newHead = reverseList(head.next);

        // fix links
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
