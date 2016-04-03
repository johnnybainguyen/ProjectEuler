package ProjectEuler;

import Algorithm.Prime;

public class P010 {
	public static void main(String args[]) {
		Prime p = new Prime();
		long counter = 2;
		long sum = 0;
		while(counter < 2000000) {
			if(p.isPrimeC(counter)) {
				sum += counter;
			}
			++counter;
		}
		System.out.println(sum);
	}
}
