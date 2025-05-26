// Last updated: 5/27/2025, 12:47:21 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        // O(1) space complexity solution
        if(head == null || head.next == null || k==1){
            return head;
        }

       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode beforeStart = dummy;

       ListNode end = head;

       int i = 0;

       while(end != null){
           i++;
       if(i % k == 0){
           // reversal 
           ListNode start = beforeStart.next;
           ListNode afterEnd = end.next;

           reverse(start , end);

           beforeStart.next = end;
           start.next = afterEnd;

           beforeStart = start;
           end = afterEnd;
       }else{
           end = end.next;
       }
       }
        return dummy.next;
    }

    void reverse(ListNode start , ListNode end ){
        ListNode curr = start;
        ListNode prev = null;
        ListNode nextNode = start.next;

        while(prev != end){
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }

    }
}