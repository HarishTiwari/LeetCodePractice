// Last updated: 5/27/2025, 12:47:13 AM
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
        // edge case
        if(head == null || head.next == null || k==0){
            return head;
        }

        // finding the length of LL
        int len = 1;
        ListNode curr = head;

        while(curr.next != null){
            len++;
            curr = curr.next;
        }

        // attaching last node to the head
        curr.next = head;
        k = k % len; // this is to detect number of cycles, after k cycle list would same
        k = len - k; // prev node of head node of new formed list

        while(k!=0){
            curr = curr.next;
            k--;
        }

        // assigning new head and forming new list
        head = curr.next;
        curr.next = null;
        return head;
    }
}