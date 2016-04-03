package ProjectEuler;

import Algorithm.Prime;

public class P027 {
	public static void main(String args[]) {
		int maxN = 0;
		int maxA = 0;
		int maxB = 0;
		int maxProduct = 0;
		Prime p = new Prime();

		for(int a = -999; a < 1000; ++a) {
			for(int b = -999; b < 1000; ++b) {
				int n = 0;
				while(true) {
					long computedFormula = (n * n) + (a * n) + b; 

					if(!(p.isPrimeC(Math.abs(computedFormula)))) {
						if(maxN < n) {
							maxN = n - 1;
							maxA = a;
							maxB = b;
							maxProduct = a * b;
						}
						break;
					}
					++n;
				}
			}
		}
		System.out.println("n: " + maxN);
		System.out.println("a: " + maxA);
		System.out.println("b: " + maxB);
		System.out.println("Product: " + maxProduct);
	}
}
