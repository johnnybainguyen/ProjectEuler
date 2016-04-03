package Algorithm;

import java.util.HashMap;

public class TwoSums {
	private int intList[];
	// Pretend intList = { 3, 5, 7, 4, 8, 3, 11 }
	
	public TwoSums(int intList[]) {
		this.intList = intList;
	}
	public int[] twoSums(int n) {
		int returnIndex[] = new int[2];
		
		for(int i = 0; i < intList.length; ++i) {
			for(int j = i+1; j < intList.length; ++j) {
				if(intList[i] + intList[j] == n) {
					returnIndex[0] = i;
					returnIndex[1] = j;
					System.out.println("Values found!");
				}
				System.out.println("(" + intList[i] + ", " + intList[j] + ")");
			}
		}
		
		return returnIndex;
	}
	
	public int[] twoSumsMap(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int returnIndex[] = new int[2];
		
		for(int i = 0; i < intList.length; ++i) {
			if(hm.containsKey(intList[i])) {
				int index = hm.get(intList[i]);
				returnIndex[0] = i;
				returnIndex[1] = index;
			} 
			else 
			{
				hm.put(n - intList[i], i);
			}
		}
		return returnIndex;
	}
	
	public static void main(String []args) {
		int []intList = { 3, 5, 7, 4, 8, 3, 11 };
		TwoSums ts = new TwoSums(intList);
		int indexReturn[] = ts.twoSumsMap(8);
		if(!(indexReturn[0] == 0 && indexReturn[0] == 0)) {
			System.out.println("First Index: " + indexReturn[0]);
			System.out.println("Value is: " + intList[indexReturn[0]]);
			System.out.println("Second Index Index: " + indexReturn[1]);
			System.out.println("Value is: " + intList[indexReturn[1]]);
		} else {
			System.out.println("No Indices found!");
		}
	}
}
