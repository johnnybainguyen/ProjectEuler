package ProjectEuler;

import java.util.ArrayList;

import Algorithm.Pandigital;

public class P038 {
	// Upper bounds
	// largest 9 digit number as a result of a concatenated product of integer 1:n
	// multiply 1:n until I hit 9 digits
	// record the max
	// mult * pan = 9dig
	
	// bounds of mult and pan
	// 1000 * 1 = 1000
	// 1000 * 2 = 2000
	// 3 EXCEED
	// add at least 2 products
	// 999 * 1 999
	// 999 * 2 = 1xxx
	// 999 * 3 = 2xxx
	//
	//99 * 1 = 99
	// 99 * 2 = 1xx
	// 99 * 3 = 2xx
	// 99 * 4  = 3xx
	// 9 * 1 x
	// 9 * 2 xx
	// 9 * 3 xx
	// 9 * 4 xx
	// 9 * 5 xx
	//
	// min 
	// 1 * 1:n = 9 digit
	public static String catProduct(ArrayList<String> al) {
		String concatString = "";
		for(int i = 0; i < al.size(); ++i) {
			concatString += al.get(i);
		}
		return concatString;
	}
	
	public static int getDigitLength(int n) {
		return (int)Math.log10(n) + 1;
	}
	
	public static void main(String args[]) {
		int maxPandigital = 0;
		Pandigital p = null;
		ArrayList<String> productList = null;
		for(int i = 1; i < 10000; ++i) {
			int panStart = 1;
			int totalDigitLength = 0;
			productList = new ArrayList<String>();
			p = new Pandigital(9);
			while(totalDigitLength < 9) {
				productList.add(String.valueOf(i * panStart));
				totalDigitLength += getDigitLength(i * panStart);
				++panStart;

			}

			if(totalDigitLength == 9) {
				
				p = new Pandigital(9);
				String concatProductString = catProduct(productList);
				int numProductString = Integer.parseInt(concatProductString);
				if(p.isPandigital(concatProductString) && numProductString > maxPandigital) {
					maxPandigital = numProductString;
				}
			}
		}
		System.out.println(maxPandigital);
	}
}
