package euler;

import java.util.ArrayList;

/*
 * Problem 3: Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143?
 */

public class Euler_3 {
	
	private static boolean isPrime(long input) {
		for(long i = input / 2; i > 1; i--)
			if(input % i == 0) return false;
		return true;
	}

	public static String output() {
		//number being factored
		Long input = Long.parseLong("600851475143");
		//list of prime factors
		ArrayList<Long> factorsList = new ArrayList<Long>();
		long i = 2;
		
		while(i != input) {
			if(input % i == 0) {
				if(isPrime(i)) {
					factorsList.add(i);
					input = input / i;
				}
			} else i++;
		}
		
		return String.valueOf(input);
	}
}
