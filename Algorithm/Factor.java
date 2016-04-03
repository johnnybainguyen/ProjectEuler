package Algorithm;

import java.util.Collections;
import java.util.Vector;

public class Factor {
	private int n;
	private int factorArray[];
	
	public Factor(int n) {
		this.n = n;
		factorArray = findAllFactor();
	}
	
	public int[] findAllFactor() {
		Vector<Integer> listFactor = new Vector<Integer>();
		//listFactor.add(1);
		for(int i = 2; i <= Math.sqrt(n); ++i) {
			if(n % i == 0) {
				listFactor.add(i);
				if(n/i != i) {
					listFactor.add(n/i);
				}
			}
		}
		Collections.sort(listFactor);
		int count = 0;
		int listFactorArray[] = new int[listFactor.size()];
		for(int i : listFactor) listFactorArray[count++] = i;
		return listFactorArray;
	}
	
	public int[] getFactorArray() {
		return factorArray;
	}
	
	public int getNumber() {
		return n;
	}
	
	public void printAllFactor() {
		String printFactorString = "";
		for(int i = 0; i < factorArray.length; ++i) {
			printFactorString += factorArray[i] + " ";
		}
		System.out.println(printFactorString);
	}
	
	public static void main(String args[]) {
		Factor f = new Factor(81);
		f.printAllFactor();
	}
}
