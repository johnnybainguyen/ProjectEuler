package ProjectEuler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Algorithm.Factor;
import Algorithm.Pandigital;

public class P032 {
	public static boolean isPandigital(int multiplicand, int multiplier, int product) {
		boolean isPandigital = true;
		Pandigital pan = new Pandigital(9);
		String merge = String.valueOf(multiplicand) 
				+ String.valueOf(multiplier) 
				+ String.valueOf(product);
		for(int i = 0; i < merge.length(); ++i) {
			isPandigital = isPandigital && pan.checkPandigital(merge.charAt(i));
		}
		return isPandigital && pan.isEmpty();
	}
	
	public static boolean isPartialPandigital(int multiplicand, int multiplier) {
		boolean isPandigital = true;
		Pandigital pan = new Pandigital(9);
		String merge = String.valueOf(multiplicand);
		for(int i = 0; i < merge.length(); ++i) {
			isPandigital = isPandigital && pan.checkPandigital(merge.charAt(i));
		}
		return isPandigital;
	}
	
	public static HashMap<Integer, Integer> getAllFactorsInPairs(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Factor f = new Factor(n);
		int factorList[] = f.getFactorArray();
		int left = 0;
		int right = factorList.length - 1;
		while(left < right) {
			hm.put(factorList[left], factorList[right]);
			++left;
			--right;
		}
		return hm;
	}
	
	public static void main(String args[]) {

		// Lesson learned - Did not read fine print to only add the product once even when it has multiple ways of finding that product
		int sum = 0;
		Factor f = null;
		HashMap<Integer, Integer> hm;
		for(int n = 0; n <= 99999; ++n) {
			boolean once = false;
			hm = getAllFactorsInPairs(n);
			Iterator it = hm.entrySet().iterator();
			while(it.hasNext() && !once) {
				Map.Entry pair = (Map.Entry)it.next();
				if(isPandigital((Integer)pair.getKey(), (Integer)pair.getValue(), n)) {
					once = true;
					sum += n;
				}
			}
		}
		
		System.out.println(sum);
		
	}
}
