public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int outLength = matrix.length;
        if (outLength == 0) {
        	return false;
        }
        int innerLength = matrix[0].length;
        for (int i = 0; i < outLength; i++) {
        	if (target < matrix[i][0]) {
        		return false;
        	}
        	if (target > matrix[i][innerLength - 1]) {
        		continue;
        	}
        	for (int j = 0; j < innerLength; j++) {
        		if (target == matrix[i][j]) {
        			return true;
        		}
        	}
        }
        return false;
    }
}