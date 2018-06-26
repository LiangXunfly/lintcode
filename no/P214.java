public class P214 {
    /**
     * @param A: An integer
     * @return: a float number
     */
    public float maxOfArray(float[] A) {
        // write your code here
        float max = A[0];
        for (float number : A) {
        	if (number > max) {
        		max = number;
        	}
        }
        return max;
    }
}