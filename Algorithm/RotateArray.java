package Algorithm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class RotateArray<Type1> {
	private ArrayList<Type1>  arrayList;
	private int numberOfRotate;
	
	public RotateArray(ArrayList<Type1> arrayList, int numberOfRotate) {
		if(arrayList == null || numberOfRotate < 0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.arrayList = arrayList;
		this.numberOfRotate = numberOfRotate % arrayList.size();
	}
	
	public ArrayList<Type1> rotateByIndexCalculation() {
		ArrayList<Type1> tempArray = new ArrayList<Type1>(arrayList.size());
		for(int i = 0; i < arrayList.size(); ++i) {
			tempArray.add(null);
		}
		
		for(int i = 0; i < arrayList.size(); ++i) {
			tempArray.set((i + numberOfRotate) % arrayList.size(), arrayList.get(i));
		}
	
		return tempArray;
	}
	
	public ArrayList<Type1> rotateByBubble() {
		for(int i = 0 ; i < numberOfRotate; ++i) {
			for(int j = arrayList.size()-1; j > 0; --j) {
				Collections.swap(arrayList, j, j-1);
			}
		}
		return arrayList;
	}
	
	// Lesson learned - They all extend from Collectoin and they accept collection type in their default constructor
	public ArrayList<Type1> rotateByReverse() {
		int cutpoint = arrayList.size() - numberOfRotate;
		ArrayList<Type1> part1 = new ArrayList<Type1>(arrayList.subList(0, cutpoint-1));
		ArrayList<Type1> part2 = new ArrayList<Type1>(arrayList.subList(cutpoint, arrayList.size()-1));
		
		Collections.reverse(part1);
		Collections.reverse(part2);
		part1.addAll(part2);
		Collections.reverse(part1);
		return part1;
	}
	
	public ArrayList<Type1> rotateByJava() {
		Collections.rotate(arrayList, numberOfRotate);
		return arrayList;
	}
	
	
	public void printArrayList(ArrayList<Type1> arrayList) {
		for(Type1 value : arrayList) {
			System.out.println(value);
		}
	}
}
