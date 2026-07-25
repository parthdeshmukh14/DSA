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
    public ListNode middleNode(ListNode head) {
        //if we were creating linklist we would have use the list.size();
        int nodecount=0;
        ListNode prev=null;
        ListNode current=head;
        while(current != null){
           
            nodecount++;
            current = current.next;
        }
        int mid=nodecount/2;
        current=head;

        
        while(mid>0){
            current=current.next;
            mid--;
        }
        return current;
    }
}