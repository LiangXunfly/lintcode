import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by liangxunfly on 2019/3/19.
 */
public class P66 {
    public static void main(String[]) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root.left != null) {
            stack.push(root);
            list.add(root.val);
        }
        return list;
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

