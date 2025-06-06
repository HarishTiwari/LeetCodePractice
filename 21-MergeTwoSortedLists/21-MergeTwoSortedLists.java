// Last updated: 5/27/2025, 12:47:22 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Edge cases
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){

                curr.next = list1;
                list1 = list1.next;
            }
            else{
                
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 == null){
            curr.next = list2;
        }
        else{
            curr.next = list1;
        }

        return newHead.next;
    }
}