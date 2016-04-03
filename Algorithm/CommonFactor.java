package Algorithm;

import DataStructure.Pair;

public class CommonFactor {
	public static int getGreatestCommonFactor(int a, int b) {
		int commonFactor = 1;
		for(int i  = a; i > 1 ; --i) {
			if(a % i == 0 
					&& b % i == 0) {
				commonFactor = i;
				break;
			}
		}
		return commonFactor;
	}
	
	public static Pair<Integer, Integer> addFraction(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
		return reduceFraction(new Pair<Integer, Integer>(p1.getFirstPair() * p2.getSecondPair() 
				+ p2.getFirstPair() * p1.getSecondPair(), p1.getSecondPair()* p2.getSecondPair()));
	}
	
	public static Pair<Integer, Integer> reduceFraction(Pair<Integer, Integer> p1) {
		int gcf = getGreatestCommonFactor(p1.getFirstPair(), p1.getSecondPair());
		return new Pair<Integer, Integer>(p1.getFirstPair()/gcf, p1.getSecondPair()/gcf);
	}
	
	public static void printFraction(Pair<Integer, Integer> pair) {
		System.out.println(pair.getFirstPair() + "/" + pair.getSecondPair());
	}
	
	public static void main(String args[]) {
		Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(21, 6);
		Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(4, 8);
		printFraction(addFraction(pair1, pair2));
	}
}
