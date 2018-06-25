public class P37 {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code 
        int first = number / 100;
        int second = number / 10 % 10;
        int last = number % 10;
        if (last == 0 && second == 0) {
        	return first;
        }
        else if (last == 0) {
        	return second * 10 + first;
        }
        else {
        	return last * 100 + second * 10 + first;
        }
    }
}