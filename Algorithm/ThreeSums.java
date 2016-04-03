package Algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class ThreeSums {
	private int intList[];
	// Pretend intList = { 3, 5, 7, 4, 8, 3, 11 }
	
	public ThreeSums(int intList[]) {
		this.intList = intList;
	}
	
	public int[] threeSums(int n) {
		int returnIndex[] = new int[3];
		
		for(int i = 0; i < intList.length; ++i) {
			for(int j = i+1; j < intList.length; ++j) {
				for(int k = j + 1; k < intList.length; ++k) {
					if(intList[i] + intList[j] + intList[k] == n) {
						returnIndex[0] = i;
						returnIndex[1] = j;
						returnIndex[2] = k;
						System.out.println("Values found!");
					}
					System.out.println("(" + intList[i] + ", " + intList[j] + ", " + intList[k] + ")");
				}

			}
		}
		
		return returnIndex;
	}
	
	// not sure if it is optimzed, but its a variation of two sums + 1 number
	public int[] threeSumsOpt(int n) {
		Arrays.sort(intList);
		int returnIndices[] = new int[3];
		for(int i = 0 ; i < intList.length; ++i) {
			int firstValue = intList[i];
			returnIndices[0] = i;
			int subTarget = n - intList[i];
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for(int j = i+1; j < intList.length; ++j) {
				if(hm.containsKey(intList[j])) {
					returnIndices[1] = hm.get(intList[j]);
					returnIndices[2] = j;
				
				}
				else {
					hm.put(subTarget - intList[j], j);
				}
			}
			
			if(returnIndices[1] == 0 && returnIndices[2] == 0) {
				returnIndices[0] = 0;
			} else {
				return returnIndices;
			}
			
		}
		
		return returnIndices;
	}
	
	public int[] threeSumsOpt2(int n) {
		Arrays.sort(intList);
		int retList[] = new int[3];
		for(int i = 0; i < intList.length - 3; ++i) {
			int a = intList[i];
			int left = i + 1;
			int right = intList.length - 1;
			while(left < right) {
				int b = intList[left];
				int c = intList[right];
				if(a + b + c == n) 
				{
					retList[0] = i;
					retList[1] = left;
					retList[2] = right;
					return retList;
				} 
				else if(a + b + c < n) { ++left; } 
				else { --right; }
			}
			
		}
		return retList;
	}
		
	public static void main(String []args) {
		int []intList = { 3, 5, 7, 4, 8, 3, 11 };
		ThreeSums ts = new ThreeSums(intList);
		for(int i = 0; i <= 30; ++i) {
			int indexReturn[] = ts.threeSumsOpt2(i);
			System.out.println(i);
			if(!(indexReturn[0] == 0 && indexReturn[1] == 0 && indexReturn[2] == 0)) {
				/*
				System.out.println("First Index: " + indexReturn[0]);
				System.out.println("Value is: " + intList[indexReturn[0]]);
				System.out.println("Second Index Index: " + indexReturn[1]);
				System.out.println("Value is: " + intList[indexReturn[1]]);
				System.out.println("Third Index Index: " + indexReturn[2]);
				System.out.println("Value is: " + intList[indexReturn[2]]);*/
				System.out.println("Indices: (" + indexReturn[0] + ", " + indexReturn[1] + ", " + indexReturn[2] + ")");
				System.out.println("Values: (" + intList[indexReturn[0]] + ", " + intList[indexReturn[1]] + ", " + intList[indexReturn[2]] + ")");
			} else {
				System.out.println("No Indices found!");
			}	
		}
	}
}
