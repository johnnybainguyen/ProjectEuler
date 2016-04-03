package Algorithm;

import java.util.Vector;
// Design reasoning:  I think finding the list of factors should be int because the number gets smaller from there
//
public class Factorization {
	public static Vector<Integer> findAllFactor(Integer n) {
		Vector<Integer> factorList = new Vector<Integer>();
		
		while(n > 1) {
			if(Prime.isPrimeInt(n)) {
				factorList.add(n);
				n = n / n;
			} else {
				int lowestFactor = findLowestFactor(n);
				n = n / lowestFactor;
				factorList.add(lowestFactor);
			}
		}
	
		return factorList;
	}
	
	public static int findLowestFactor(int n) {
		for(int i = 2; i < n; ++i) {
			if(n % i == 0) {
				return i;
			}
		}
		
		return 1;
	}
	
	public static void printAllFactor(Vector<Integer> v) {
		for(int i = 0; i < v.size(); ++i) {
			System.out.println(v.get(i));
		}
	}
	
	public static void main(String args[]) {
		//Vector<Integer> test = Factorization.findAllFactor(50);
		Factorization.printAllFactor(Factorization.findAllFactor(220));
	}
}
