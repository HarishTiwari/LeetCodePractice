// Last updated: 5/27/2025, 12:46:56 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return head;

        ListNode meet = findMeetingNode(head);

        if(meet == null) return meet;

        ListNode start = head;

        while(start != meet){
            meet = meet.next;
            start = start.next;
        }

        return meet;
    }

    public ListNode findMeetingNode(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return slow;
            }
        }

        return null;
    }
}