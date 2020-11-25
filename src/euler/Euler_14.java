package euler;

/*
 * Problem 14: Longest Collatz sequence
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class Euler_14 {
	
	private static boolean isEven(long input) {
		if(input % 2 == 0) return true;
		return false;
	}
	
	public static String output() {
		long sequence_start = 1000000;
		long longest_sequence_length = 0;
		long longest_sequence_start = 0;
		
		while(sequence_start > 2) {
			long temp = sequence_start;
			long curr_length = 0;
			
			System.out.println("Checking " + sequence_start);
			
			while(temp != 1) {
				if(isEven(temp)) {
					temp = temp/2;
					curr_length++;
				} else {
					temp = 3 * temp + 1;
					curr_length++;
				}
			}
			
			if(curr_length > longest_sequence_length) {
				longest_sequence_length = curr_length;
				longest_sequence_start = sequence_start;
			}
			
			sequence_start--;
		}
		
		return String.valueOf(longest_sequence_start);
	}
}
