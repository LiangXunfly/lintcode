/**
 * Created by liangxunfly on 2019/3/11.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P22 {
    public static void main(String[] args) {

    }
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        int length = nestedList.size();
        if (nestedList == null || length == 0) {
            return null;
        }
        else {
            for (int i = length - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
            while (!stack.empty()) {
                NestedInteger current = stack.pop();
                if (current.isInteger()) {
                    result.add(current.getInteger());
                }
                else {
                    List<NestedInteger> ls = current.getList();
                    length = ls.size();
                    for (int i = length - 1; i >= 0; i--) {
                        stack.push(ls.get(i));
                    }
                }
            }
        }
        return result;
    }
}

interface NestedInteger {
    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}
