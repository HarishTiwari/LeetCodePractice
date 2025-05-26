// Last updated: 5/27/2025, 12:46:48 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode firstHead, ListNode secondHead) {
        if(firstHead == null || secondHead == null){
           return null;
       }

       int firstLen = length(firstHead);
       int secondLen = length(secondHead);

       while(firstLen > secondLen){
           firstHead = firstHead.next;
           firstLen--;
       }

       while(secondLen > firstLen){
           secondHead = secondHead.next;
           secondLen--;
       }
       
       while(firstHead != null && secondHead != null){
           if(firstHead == secondHead){
               return firstHead;
           }
           firstHead = firstHead.next;
           secondHead = secondHead.next;
       }

       return null;
    }
    
    public static int length(ListNode head){
        int count = 0;
        ListNode curr = head;
        
        while(curr !=null){
            count++;
            curr = curr.next;
        }

        return count;
    }
}