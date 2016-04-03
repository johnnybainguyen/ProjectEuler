package ProjectEuler;

import Algorithm.Prime;

public class P007 {
	// find the nth prime number
	// in this case 10001
	private Prime p;
	public P007() {
		p = new Prime();
	}
	
	public long nthPrime(int n) {
		long found = 0;
		long counter = 0;
		long test = 0;
		
		// Lesson learned:  the confusing part about this code is that its the for while loop hybrid
		// Lesson learned: counter is incremented before leaving the loop
		// Lesson learned: to use counter as a return value, we have to break when it hits n
		// Lesson learned: I can use break to exit a loop early so I dont have to continue processing it
		// this is important when im processing large data
		
		// Lesson learned:  if i want to run a code that runs until it finds something, i can while(true) and then break
		while(true) {
			if(p.isPrimeC(counter)) {
				++found;
				if(found == n) {
					break;
				}
			}
			++counter;
		}
		return counter;
	}
	
	public static void main(String args[]) {
		P007 p = new P007();
		long result = p.nthPrime(10001);
		System.out.println(result);
	}
	
	
}
