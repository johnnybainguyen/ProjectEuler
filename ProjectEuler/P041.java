package ProjectEuler;

import Algorithm.Pandigital;
import Algorithm.SievesOfEratosthenes;

public class P041 {
	public static void main(String args[]) {
		SievesOfEratosthenes soe = new SievesOfEratosthenes(987654321);
		boolean primeList[] = soe.getPrimeCheckList();
		int start = primeList.length - 1;
		int primePandigitalFound = 0;
		Pandigital p = null;
		while(true) {
			if(primeList[start] == false) {
				// do something
				p = new Pandigital((int)Math.log10(start) + 1);
				if(p.isPandigital(String.valueOf(start))) {
					primePandigitalFound = start;
					break;
				}
			}
			--start;
		}
		System.out.println(primePandigitalFound);
	}
}
