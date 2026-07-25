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
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            // Save the next node
            ListNode next = current.next;

            // Reverse the link
            current.next = prev;

            // Move prev one step forward
            prev = current;

            // Move current one step forward
            current = next;
        }

        // prev is the new head of the reversed list
        return prev;
    }
}