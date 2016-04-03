package ProjectEuler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Vector;


// Lesson Learned when organizing class and functoins and static
// be careful with static value because you cant instantitate multiple values because THEY ARE SHARED and they can fuck you up
// 
public class P005 {
	private Vector<Integer> factorList;
	private int numberToFactor;
	
	public P005(int n) {
		factorList = new Vector<Integer>();
		numberToFactor = n;
		calculateAllFactor(numberToFactor);
	}
	
	public static boolean isPrime(int n) {
		int start = 2;
		if(n == 2) {
			return true;
		}
		
		while(start <= Math.sqrt(n)) {
			if(n % start == 0) {
				return false;
			}
			++start;
		}
		
		return true;
	}
	
	public static int findLowestDivisor(int n) {
		if(n == 2) { 
			return 2;
		}
		for(int i = 2; i < n; ++i) {
			if(n % i == 0) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void calculateAllFactor(int n) {
		int mainNumber = n;
		
		while(mainNumber != 1) {
			if(isPrime(mainNumber)) {
				factorList.add(mainNumber);
				mainNumber = 1;
			} else {
				int divisor = findLowestDivisor(mainNumber);
				factorList.add(divisor);
				mainNumber /= divisor;
			}
		}

	}
	
	public Vector<Integer> getFactorList() {
		return factorList;
	}
	
	public void printFactorList() {
		for(int i = 0; i < factorList.size(); ++i) {
			System.out.println(factorList.get(i));
		}
	}
	
	public static Vector<Integer> unionTwoFactorList(Vector<Integer> masterList, P005 p2) {
		Vector<Integer> factorList1 = masterList;
		Vector<Integer> factorList2 = p2.getFactorList();
		//p1.printFactorList();
		//p2.printFactorList();
		Vector<Integer> returnList = new Vector<Integer>();
		for(int i = 0; i < factorList1.size(); ++i) {
			for(int j = 0; j < factorList2.size(); ++j) {
				if(factorList1.get(i) == factorList2.get(j) && factorList1.get(i) != -1) {
					returnList.add(factorList1.get(i));
					factorList1.set(i, -1);
					factorList2.set(j, -1);
				}
			}
		}
		for(int i = 0; i < factorList1.size(); ++i) {
			if(factorList1.get(i) != -1) 
				returnList.add(factorList1.get(i));
		}
		for(int i = 0; i < factorList2.size(); ++i) {
			if(factorList2.get(i) != -1) 
				returnList.add(factorList2.get(i));
		}
		
		return returnList;
	}

	public static void main(String args[]) {
		Vector<Integer> masterList = new Vector<Integer>();
		Vector<P005> factoredList = new Vector<P005>();
		for(int i = 2; i < 11; ++i) {
			factoredList.add(new P005(i));
		}

		for(int i = 0; i < factoredList.size(); ++i) {
			masterList = P005.unionTwoFactorList(masterList, factoredList.get(i));
		}	
		
		long totalSum = 1;
		for(int i = 0; i < masterList.size(); ++i) {
			totalSum *= masterList.get(i);
		}
		
		System.out.println(totalSum);
		
		

	}
}
