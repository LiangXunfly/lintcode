public class P239 {
    /*
     * @param a: parameter of the equation
     * @param b: parameter of the equation
     * @param c: parameter of the equation
     * @return: a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        // write your code here
        double judge = b * b - 4 * a * c;
        if (judge < 0) {
        	return new double[] {};
        }
        else if (judge == 0) {
        	return new double[] {-b / (2 * a)};
        }
        else {
        	double one = (-b - Math.sqrt(judge)) / (2 * a);
        	double second = (-b + Math.sqrt(judge)) / (2 * a);
        	if (one > second) {
        		return new double[] {second, one};
        	}
        	else {
        		return new double[] {one, second};
        	}
        }
    }
}