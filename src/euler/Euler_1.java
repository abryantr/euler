package euler;

/*
 * Problem 1: Multiples of 3 and 5
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Euler_1 {
	
	//returns true if input is a multiple of 3 and 5
	private static boolean isMultiple(int input) {
		if(input % 3 == 0 || input % 5 == 0) return true;
		return false;
	}
	
	public static String output() {
		int sum = 0;
		for(int i = 0; i < 1000; i++) {
			if(isMultiple(i)) sum += i;
		}
		return String.valueOf(sum);
	}
}