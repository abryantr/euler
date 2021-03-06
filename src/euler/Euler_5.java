package euler;

/*
 * Problem 5: Smallest Multiple
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler_5 {

	private static boolean isDivisible(long input) {
		long[] factorList = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(long i : factorList) {
			if(input % i != 0) return false;
		}
		return true;
	}
	
	public static String output() {
		long output_long = 20;
		
		while(!isDivisible(output_long))
			output_long += 2;
		
		return String.valueOf(output_long);
	}
}
