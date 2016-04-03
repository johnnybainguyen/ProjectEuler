package ProjectEuler;

import Algorithm.SievesOfEratosthenes;

public class P035 {
	public static int rotateNumber(int n) {
		int numDigits = (int)Math.log10(n);
		int multiplier = (int)Math.pow(10, numDigits);
		int partNumber = n / 10;
		int rotatedNumber = n % 10;
		return partNumber + rotatedNumber * multiplier;
	}
	
	public static void main(String args[]) {
		SievesOfEratosthenes s = new SievesOfEratosthenes(1000000);
		int countCircularPrimes = 0;
		for(int i = 2; i < 1000000; ++i) {
			boolean isCircular = true;
			int numberToRotate = i;
			for(int j = 0; j <= (int)Math.log10(i); ++j) {
				isCircular = isCircular && s.isPrime(numberToRotate);
				numberToRotate = rotateNumber(numberToRotate);
			}
			if(isCircular) {
				++countCircularPrimes;
			}
		}
		System.out.println(countCircularPrimes);
	}
}
