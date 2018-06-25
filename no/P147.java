import java.util.List;
import java.util.ArrayList;

public class P147 {
    /**
     * @param n: The number of digits
     * @return: All narcissistic numbers with n digits
     */
    /*
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725
		, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477};
		return new ArrayList();
	}
	*/

	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 
			9800817, 9926315, 24678050, 24678051, 88593477};
		ArrayList result = new ArrayList();
		int n = 2;
		int number = (int)Math.pow(10, 2);
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (array[i] / number >= 1 && array[i] / number <= 9) {
				result.
			}
		}
	}
}