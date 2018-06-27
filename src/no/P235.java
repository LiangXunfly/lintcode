import java.util.List;
import java.util.ArrayList;

public class P235 {
    /**
     * @param num: An integer
     * @return: an integer array
     */
    public List<Integer> primeFactorization(int num) {
        // write your code here
    	ArrayList<Integer> result = new ArrayList<Integer>();
        if (num == 2) {
            result.add(2);
            return result; 
        } 
    	int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463};
        boolean end = false;
        int length = primes.length;
        while (end == false) {
            for (int i = 0; i < length; i++) {
                if (primes[i] > Math.sqrt(num)) {
                    end = true;
                    break;
                }
                if (num % primes[i] == 0) {
                    result.add(primes[i]);
                    num /= primes[i];
                    break;
                }
                if (i == length - 1) {
                    end = true;
                    break;
                }
            }
        }
        if (num != 1) {
            result.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        // write your code here
        int num = 660;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (num == 2) {
            result.add(2); 
            return;
        }
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463};
        boolean end = false;
        int length = primes.length;
        while (end == false) {
            for (int i = 0; i < length; i++) {
                if (primes[i] > Math.sqrt(num)) {
                    end = true;
                    break;
                }
                if (num % primes[i] == 0) {
                    result.add(primes[i]);
                    num /= primes[i];
                    break;
                }
                if (i == length - 1) {
                    end = true;
                    break;
                }
            }
        }
        if (num != 1) {
            result.add(num);
        }
        for (Integer re : result) {
            System.out.println(re);
        }
    }
}