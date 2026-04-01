class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        
        ListNode head = new ListNode(0);

       
        PriorityQueue<ListNode> minHeap =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        
        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null){
                minHeap.add(lists[i]);
            }
        }

        ListNode curr = head;

        
        while(!minHeap.isEmpty()){

            ListNode min = minHeap.poll(); 

            curr.next = min;
            curr = curr.next;

           
            if(min.next != null){
                minHeap.add(min.next);
            }
        }

        return head.next;
    }
}