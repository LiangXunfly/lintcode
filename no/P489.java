/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param nums: an integer array
     * @return: the first node of linked list
     */
    public ListNode toLinkedList(List<Integer> nums) {
        // write your code here
        ListNode result = null;
        int length = nums.size();
        for (int i = length - 1; i >= 0; i--) {
        	if (i == length - 1) {
        		result = new ListNode(nums.get(i));
        	}
        	else {
        		ListNode now = new ListNode(nums.get(i));
        		now.next = result;
        		result = now;
        	}
        }
        return result;
    }
}