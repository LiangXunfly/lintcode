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
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null) {
        	return null;
        }
        ListNode temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        while (temp != null) {
        	stack.push(temp.val);
        	temp = temp.next;
        }
        temp = head;
       	while (!stack.empty()) {
       		temp.val = stack.pop();
       		temp = temp.next;
       	}
       	return head;
    }
}