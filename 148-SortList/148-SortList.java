// Last updated: 5/27/2025, 12:46:52 AM
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
           return head;
       }

       // find middle element of linked list

       ListNode slow = head;
       ListNode fast = head;

       while(fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }

       ListNode mid = slow.next;

       // splitting two list 
       slow.next = null;
       ListNode left = sortList(head);
       ListNode right = sortList(mid);

       // returing the merged list
       return merge(left , right);
    }

    public static ListNode merge(ListNode left, ListNode right) {

        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;

        while(left != null && right != null){
            if(left.val <= right.val){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }
            curr = curr.next; 
        }

        if(left != null){
            curr.next = left;
        }else{
            curr.next = right;
        }
        
        return dummyNode.next;
    }
}