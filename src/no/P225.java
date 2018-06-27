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
    /*
     * @param head: the head of linked list.
     * @param val: An integer.
     * @return: a linked node or null.
     */
    public ListNode findNode(ListNode head, int val) {
        // write your code here
        if (head == null) {
        	return null;
        }
        ListNode temp = head;
        while (temp != null) {
        	if (temp.val == val) {
        		return temp;
        	}
        	else {
        		temp = temp.next;
        	}
        }
        return null;
    }
}