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
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        // write your code here
        if (head == null) {
        	return null;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
        	size++;
        	temp = temp.next;
        } 
        int location = (size + 1) / 2;
        temp = head;
        for (int i = 2; i <= location; i++) {
        	temp = temp.next;
        }
        return temp;
    }
}