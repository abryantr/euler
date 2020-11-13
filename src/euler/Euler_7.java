package euler;

/*
 * Problem 7: 10001st prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 */

public class Euler_7 {
	
	private static boolean isPrime(int input) {
		for(int i = input / 2; i > 1; i--)
			if(input % i == 0) return false;
		return true;
	}
	
	public static String output() {
		int lastPrime = 0;
		int checking = 2;
		
		for(int i = 0; i < 10001; i++) {
			while(!isPrime(checking)) {
				checking++;
			}
			lastPrime = checking;
			checking++;
		}
		
		return String.valueOf(lastPrime);
	}
}
