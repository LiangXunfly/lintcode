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

public class P452 {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        //先把除头Node之外的符合Node删除
        while (temp != null && temp.next != null) {
            if (temp.val == val) {
                temp.next = temp.next.next;
            }
            else {
            	temp = temp.next;
            }
        }
        //判断头Node符不符合
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    public static void main(string[] args) {

    }
}