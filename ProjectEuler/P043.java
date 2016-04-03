package ProjectEuler;

import java.util.Vector;

import Algorithm.Pandigital;
import Algorithm.SievesOfEratosthenes;

public class P043 {
	public static boolean subStringDivisible(String s) {
		int primeList[] = {2, 3, 5, 7, 11, 13, 17};
		boolean isPrimeDivisible = true;
		
		for(int i = 1; i < s.length() - 2; ++i) {
			String substring = s.substring(i, i + 3);
			isPrimeDivisible = isPrimeDivisible && Integer.parseInt(substring) % primeList[i-1] == 0;
		}
		return isPrimeDivisible;
	}
	
	public static void main(String args[]) {
		Pandigital p = new Pandigital(9, true);
		
		int currentPercent = 0;
		for(long i = 1234567890; i <= 9876543210f; ++i) {
			int cPercent = (int)((i / 9876543210f) * 1000);
			if(currentPercent != cPercent) {
				System.out.println((float)cPercent/10 + "%");
				currentPercent = cPercent;
			}
			if(subStringDivisible(String.valueOf(i))) {
				if(p.isPandigital(String.valueOf(i))) {
					System.out.println(i);
				}
				
			}
		}
	}
	
}
