/**
 * Created by liangxunfly on 2019/3/18.
 */
public class P64 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0};
        int[] B = {4, 5};
        mergeSortedArray2(A, 3, B, B.length);
    }

    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int[] result = new int[m+n];
        int AIndex = 0;
        int BIndex = 0;
        for (int i = 0; i < m + n; i++) {
            if (AIndex >= m) {
                result[i] = B[BIndex++];
            }
            else if (BIndex >= n) {
                result[i] = A[AIndex++];
            }
            else if (A[AIndex] > B[BIndex]) {
                result[i] = B[BIndex++];
            }
            else {
                result[i] = A[AIndex++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            A[i] = result[i];
        }
    }

    public static void mergeSortedArray2(int[] A, int m, int[] B, int n) {
        // write your code here
        int count = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (A[m] > B[n]) {
                A[count--] = A[m--];
            }
            else {
                A[count--] = B[n--];
            }
        }
        while (n >= 0) {
            A[count--] = B[n--];
        }
    }
}
