import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by liangxunfly on 2018/6/28.
 */
public class BinaryTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(2);
        head.right.left = new TreeNode(-4);
        head.right.right = new TreeNode(-5);
        head.left = new TreeNode(5);
        head.left.right = new TreeNode(3);
        head.left.right.left = new TreeNode(4);
        head.left.left = new TreeNode(0);
        head.left.left.right = new TreeNode(10);
        head.left.left.right.left = new TreeNode(11);
        head.left.left.right.right = new TreeNode(12);
        //System.out.println(maxNode(head).val);

        preorderLoop(head);
        //preorderIteratoin(head);

        //middleorderLoop(head);
        //middleorderIteratoin(head);

        //lastorderLoop(head);
        //lastorderIteratoin(head);
    }

    public static TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        TreeNode result = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            if (temp.val > result.val) {
                result = temp;
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return result;
    }

    public static void preorderLoop(TreeNode head) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (head == null) {
            return;
        }
        stack.push(head);
        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public static void preorderIteratoin(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        if (head.left != null) {
            preorderIteratoin(head.left);
        }
        if (head.right != null) {
            preorderIteratoin(head.right);
        }
    }

    public static void middleorderLoop(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = head;
        stack.push(temp);
        while (!stack.empty()) {
            while (temp.left != null) {
                stack.push(temp.left);
                temp=temp.left;
            }
            TreeNode current = stack.pop();
            System.out.println(current.val);
            if (current.right != null) {
                stack.push(current.right);
                temp = current.right;
            }
        }
    }

    public static void middleorderIteratoin(TreeNode head) {
        if (head == null) {
            return;
        }
        if (head.left != null) {
            middleorderIteratoin(head.left);
        }
        System.out.println(head.val);
        if (head.right != null) {
            middleorderIteratoin(head.right);
        }
    }

    public static void lastorderIteratoin(TreeNode head) {
        if (head == null) {
            return;
        }
        if (head.left != null) {
            lastorderIteratoin(head.left);
        }
        if (head.right != null) {
            lastorderIteratoin(head.right);
        }
        System.out.println(head.val);
    }

    public static void lastorderLoop(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        HashMap<TreeNode, Boolean> map = new HashMap<TreeNode, Boolean>();
        stack.push(head);
        TreeNode temp = head;
        while (!stack.empty()) {
            while (temp.left != null && !map.containsKey(temp.left)) {
                stack.push(temp.left);
                temp = temp.left;
            }
            if (temp.right != null && !map.containsKey(temp.right)) {
                stack.push(temp.right);
                temp = temp.right;
            }
            else {
                TreeNode current = stack.pop();
                map.put(current, true);
                System.out.println(current.val);
                if (!stack.empty()) {
                    temp = stack.peek();
                    if (temp.right != null && !map.containsKey(temp.right)) {
                        stack.push(temp.right);
                        temp = temp.right;
                    }
                }
            }
        }
    }
}


class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
