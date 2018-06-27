/**
 * Definition for ListNode
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
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        if (head == null) {
        	return new ListNode(val);
        }
        if (val <= head.val) {
        	ListNode newNode = new ListNode(val);
        	newNode.next = head;
        	return newNode;
        }
        ListNode first = head;
        while (first.next != null && val > first.next.val) {
        	first = first.next;
        }
        ListNode insert = new ListNode(val);
        insert.next = first.next;
        first.next = insert;
        return head;
    }
}