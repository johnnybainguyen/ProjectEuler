package DataStructure;

import EnumObject.Alphabet;

public class TriangleNumber {
	public int triangleList[];
	public TriangleNumber(int nth) {
		triangleList = new int[nth];
		for(int i = 0; i < triangleList.length; ++i) {
			triangleList[i] = (int)((.5 * (i + 1)) * (i + 1 + 1));
		}
	}
	
	public void printAllTriangleNumber() { 
		for(int i = 0; i < triangleList.length; ++i) {
			System.out.println(triangleList[i]);
		}
	}
	
	public boolean isTriangleNumber(int n) {
		boolean isTriangleNumber = false;
		for(int i = 0; i < triangleList.length; ++i) {
			if(triangleList[i] == n) {
				isTriangleNumber = true;
				break;
			}
		}
		
		return isTriangleNumber;
	}
	
	public int getWordValue(String word) {
		Alphabet alphabet = new Alphabet();
		int totalWordValue = 0;
		for(int i = 0; i < word.length(); ++i) {
			totalWordValue += alphabet.getAlphabetNumber(word.charAt(i));
		}
		return totalWordValue;
	}
}
