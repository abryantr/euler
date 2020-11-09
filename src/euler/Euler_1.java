package euler;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Euler_1 {
	
	public static boolean isMultiple(int input) {
		if(input % 3 == 0 || input % 5 == 0) return true;
		return false;
	}
	
	public static int output() {
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			if(isMultiple(i)) sum += i;
		}
		return sum;
	}
}