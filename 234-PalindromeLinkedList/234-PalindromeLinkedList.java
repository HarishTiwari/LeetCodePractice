// Last updated: 5/27/2025, 12:46:33 AM
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
        
        if(head == null || head.next == null){
            return true;
        }

        ListNode mid = middleOfLinkedList(head);
        ListNode last = reverseOfLinkedList(mid);
        ListNode curr = head;

        while(last != null){
            if(last.val != curr.val){
                return false;
            }

            last = last.next;
            curr = curr.next;
        }

        return true;
    }

    ListNode middleOfLinkedList(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    ListNode reverseOfLinkedList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}