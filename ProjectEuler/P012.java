package ProjectEuler;

import java.util.Vector;

import Algorithm.Divisible;
import Algorithm.Factorization;

// Lesson learned - use better naming convention to understand code better
// Lesson learned - think about the input and output - dont overdo calculations that dont matter
// Lesson learned - dont overdo the code - coding too much can lead to over thinking the problem before i even get to the answer
public class P012 {
	public static void main(String args[]) {
		long triangleNumber = 0;
		long counter = 1;
		long numDivisor = 0; 
		while(numDivisor <= 500) {
			triangleNumber += counter;
			++counter;
			
			numDivisor = 0;
			for(int i = 1; i <= Math.sqrt(triangleNumber); ++i) {
				if(triangleNumber % i == 0) {
					++numDivisor;
					++numDivisor;
				}
			}
			System.out.println(numDivisor);
		}
		System.out.println(triangleNumber);
	}
}
