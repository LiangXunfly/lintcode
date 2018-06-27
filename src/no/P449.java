public class P449 {
    /**
     * @param character: a character
     * @return: An integer
     */
    public int charToInteger(char character) {
        // write your code here
        return 95 + (character - '_');
    }

    public static void main(String[] args) {
    	char character = 'A';
    	System.out.println(95 + (character - '_'));
    }
}