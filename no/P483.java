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
     * @param head: the head of linked list.
     * @return: An integer list
     */
    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (head == null) {
        	return result;
        } 
        while (head != null) {
        	result.add(head.val);
        	head = head.next;
        }
        return result;
    }
}