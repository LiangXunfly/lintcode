public class P463 {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
        	int minIndex = i;
        	for (int j = i + 1; j < n; j++) {
        		if (A[j] < A[minIndex]) {
        			minIndex = j;
        		}
        	}
        	int temp = A[i];
        	A[i] = A[minIndex];
        	A[minIndex] = temp;
        }
    }
}