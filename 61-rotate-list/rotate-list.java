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
    public ListNode rotateRight(ListNode head, int k) {
       if (head == null || head.next == null || k == 0) return head;

 int length=1;
        ListNode tail=head;
        while (tail.next !=null){
            length++;
            tail= tail.next;
        }
        tail.next=head;
        k=k%length;
        if(k==0){
            tail.next=null;
            return head;
        }
        ListNode newLastNode= getNewHead(head,length-k);
       ListNode newHead = newLastNode.next;
               newLastNode.next = null;

        return newHead;


    }
     private ListNode getNewHead(ListNode head, int n){
        ListNode current=head;
        for(int i =1;i<n;i++){
            current=current.next;
                    
        }
        return current;

    }
}