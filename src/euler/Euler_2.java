package euler;

/*
 * Problem 2: Even Fibonacci numbers
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Euler_2 {

	//returns true if input is even
	private static boolean isEven(int input) {
		if(input % 2 == 0) return true;
		return false;
	}
	
	public static String output() {
		//sum of even Fibonacci numbers, output
		int sum = 0;
		//current Fibonacci number
		int curr = 1;
		//previous Fibonacci number
		int prev = 1;
		
		while(curr < 4000000) {
			if(isEven(curr)) sum += curr;
			int temp = curr;
			curr += prev;
			prev = temp;
		}
		
		return String.valueOf(sum);
	}
}
