package euler;

/*
 * Problem 4: Largest palindrome product
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler_4 {

	private static boolean isPalindrome(int int_input) {
		String input = String.valueOf(int_input);
		char[] input_array = input.toCharArray();
		
		for(int i = 0; i < (input_array.length / 2); i++) {
			if(input_array[i] != input_array[input_array.length - i - 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static String output() {
		int x = 999;
		int y = 999;
		int output = 0;
		
		while(x > 99) {
			while(y > 99) {
				if(isPalindrome(x * y))
					if(x * y > output) output = x * y;
				y--;
			}
			y = 999;
			x--;
		}
		
		return String.valueOf(output);
	}
}
