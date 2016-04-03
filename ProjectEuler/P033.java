package ProjectEuler;

import Algorithm.CommonFactor;
import DataStructure.Pair;

public class P033 {
	public static boolean hasMatchingCrossNumber(int numerator, int denominator) {
		int numeratorOne = numerator / 10;
		int numeratorTwo = numerator % 10;
		int denominatorOne = denominator / 10;
		int denominatorTwo = denominator % 10;
		return numeratorTwo == denominatorOne || numeratorOne == denominatorTwo;
	}
	
	public static double getNumerator(int numerator, int denominator) {
		int numeratorOne = numerator / 10;
		int numeratorTwo = numerator % 10;
		int denominatorOne = denominator / 10;
		int denominatorTwo = denominator % 10;
		return numeratorOne == denominatorTwo ? numeratorTwo : numeratorOne;
	}
	
	public static double getDenominator(int numerator, int denominator) {
		int numeratorOne = numerator / 10;
		int numeratorTwo = numerator % 10;
		int denominatorOne = denominator / 10;
		int denominatorTwo = denominator % 10;
		return numeratorOne == denominatorTwo ? denominatorOne : denominatorTwo;
	}
	
	public static void main(String args[]) {
		int top = 1;
		int bottom = 1;
		for(int numerator = 11; numerator < 100; ++numerator) {
			for(int denominator = numerator + 1 ; denominator < 100; ++denominator) {
				if(numerator % 10 != 0 || denominator % 10 != 0) {
					if(hasMatchingCrossNumber(numerator, denominator)) {
						if(getNumerator(numerator, denominator) / getDenominator(numerator, denominator) == (double)numerator/(double)denominator) {
							top *= numerator;
							bottom *= denominator;
							
						}
					}
				}
			}
		}
		System.out.println(top + "/" + bottom);
		Pair<Integer, Integer> pair = CommonFactor.reduceFraction(new Pair<Integer, Integer>(top, bottom));
		System.out.println(pair.getFirstPair() + "/" + pair.getSecondPair());
	}
}
