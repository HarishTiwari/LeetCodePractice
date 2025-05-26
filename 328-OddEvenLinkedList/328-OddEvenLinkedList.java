// Last updated: 5/27/2025, 12:46:23 AM
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        int index = 0;
        ListNode curr = head;
        ListNode evenHead = null;
        ListNode evenTail = null;
        ListNode oddHead = null;
        ListNode oddTail = null;

        while(curr != null){
            if(index % 2 == 0){
                if(evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }else{
                if(oddHead == null){
                    oddHead = curr;
                    oddTail = curr;
                }else{
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }

            index += 1;
            curr = curr.next;
        }

        if(evenTail != null){
            evenTail.next = oddHead;
        }

        if(oddTail != null){
            oddTail.next = null;
        }

        return evenHead;
    }
}