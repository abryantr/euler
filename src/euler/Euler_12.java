package euler;

/*
 * Problem 12: Highly divisible triangular number
 * 
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * Let us list the factors of the first seven triangle numbers:
 * 
 *   1: 1
 *   3: 1,3
 *   6: 1,2,3,6
 *  10: 1,2,5,10
 *  15: 1,3,5,15
 *  21: 1,3,7,21
 *  28: 1,2,4,7,14,28
 *  
 *  We can see that 28 is the first triangle number to have over five divisors.
 *  
 *  What is the value of the first triangle number to have over five hundred divisors?
 */

public class Euler_12 {
	
	private static int numberOfFactors(int input) {
		
		int factors = 1;
		
		for(int i = input/2; i > 0; i--) {
			if(input % i == 0) factors++;
		}
		
		System.out.println(factors + " factors");
		return factors;
	}
	
	private static int nextTriangularNumber(int input) {
		if(isEven(input)) {
			return (input + 1) * (input / 2);
		} else {
			return (((input + 1) * (input / 2)) + (input / 2 + 1));
		}
	}
	
	private static boolean isEven(int input) {
		if(input % 2 == 0) return true;
		return false;
	}
	
	public static String output() {
		int triangularNumber =  1;
		int iterator = 1;
		boolean has500Factors = false;
		
		while(!has500Factors) {
			iterator++;
			triangularNumber = nextTriangularNumber(iterator);
			System.out.println("Checking " + triangularNumber);
			if(numberOfFactors(triangularNumber) > 500) has500Factors = true;
		}
		
		return String.valueOf(triangularNumber);
	}
}
