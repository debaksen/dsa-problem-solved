/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head1 = l1;
        ListNode head2 = l2;
        
        ListNode curr = new ListNode(-1);
        ListNode head = curr;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            }
            else {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }
        }
        
        while(l1 != null){
            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;
        }
        
        
        while(l2 != null){
            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }
        
       return head.next;
    }
}
