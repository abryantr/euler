package euler;

import java.util.ArrayList;

/*
 * Problem 10: Summation of primes
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */

public class Euler_10 {
	
	public static String output() {
		
		//the sieve
		ArrayList<Integer> sieve = new ArrayList<Integer>();
		
		for(int i = 2; i < 2000000; i++) {
			
			boolean isPrime = true;
			//System.out.println("checking " + String.valueOf(i));
			
			for(Integer j : sieve) {
				if(i != j.intValue() && i % j.intValue() == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) sieve.add(new Integer(i));
		}
		
		long sumOfPrimes = 0;
		for(Integer l : sieve) {
			sumOfPrimes += l.intValue();
		}
		
		return String.valueOf(sumOfPrimes);
	}
}
