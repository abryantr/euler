package euler;

/*
 * Problem 9: Special Pythagorean triplet
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * 
 * Find the product abc.
 */

public class Euler_9 {
	
	private static boolean isTriplet(int a, int b,  int c) {
		if(a*a + b*b == c*c) return true;
		return false;
	}
	
	public static String output() {
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(a < 1000) {
			while(b < 1000) {
				while(c < 1000) {
					if(isTriplet(a,b,c)) {
						if(a+b+c==1000) {
							if(a != b && b != c && a != c) {
								return String.valueOf(a*b*c);
							}
						}
					}
					c++;
				}
				c = 0;
				b++;
			}
			b = 0;
			a++;
		}
		return "";
	}
}
