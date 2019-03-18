/**
 * Created by liangxunfly on 2019/3/18.
 */
public class P60 {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] A, int target) {
        // write your code here
        int length = A.length;
        if (length == 0) {
            return 0;
        }
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int medium = A[mid];
            if (medium == target) {
                return mid;
            }
            else if (A[end] < target) {
                return end + 1;
            }
            else if (A[start] > target) {
                return start;
            }
            else if (medium > target) {
                end = mid - 1;
            }
            else if (medium < target) {
                start = mid + 1;
            }
        }
        return 0;
    }
}
