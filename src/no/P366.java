public class P366 {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1) {
        	return 0;
        }
        else if (n == 2) {
        	return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int i = 3;
        while (i < n) {
        	int n3 = n2 + n1;
        	n1 = n2;
        	n2 = n3;
        	i++;
        }
        return n1 + n2;
    }
}