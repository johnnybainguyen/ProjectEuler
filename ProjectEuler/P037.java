package ProjectEuler;

import Algorithm.SievesOfEratosthenes;
import Algorithm.TruncateNumbers;

public class P037 {
	public static void main(String args[]) {
		int numberOfPrimesFound = 0;
		int sum = 0;
		int counter = 11;
		SievesOfEratosthenes s = new SievesOfEratosthenes(1000000);
		TruncateNumbers tn = null;
		int truncatedList[] = null;
		while(numberOfPrimesFound < 11) {
			if(s.isPrime(counter)) {
				tn = new TruncateNumbers(counter);
				truncatedList = tn.getTruncatedList();
				boolean isATruncatedPrime = true;
				for(int i = 0; i < truncatedList.length; ++i) {
					isATruncatedPrime = isATruncatedPrime && s.isPrime(truncatedList[i]);
				}
				
				if(isATruncatedPrime) {
					sum += counter;
					numberOfPrimesFound++;
				}
			}
			++counter;
		}
		System.out.println(sum);
		System.out.println(numberOfPrimesFound);
	}
}
