package DataStructure;

public class Pyramid {
	private long pyramidArray[];
	private int height;
	private int nodeCount;
	private long maxValuePath;
	
	// Question:  making a variable to reduce calling a function?
	
	// Lesson learned when swapping numbers - 
	// 	a = 3 b = 7
	// 	a += b;
	//  b = a - b
	// 	a = 7 b = 3
	public Pyramid(long paramidArray[], int height, int nodeCount) {
		this.pyramidArray = paramidArray;
		this.height = height;
		this.nodeCount = nodeCount;
		maxValuePath = 0;
	}
	
	public int getLeft(int i) {
		return i < nodeCount ?  i + getCurrentRow(i) : -1;
	}
	
	public int getRight(int i) {
		return i < nodeCount ? i + getCurrentRow(i) + 1 : -1;
	}
	
	public int getCurrentRow(int i) {
		int currRow = 1;
		int sumRow = 1;

		while(sumRow <= i) {
			sumRow += currRow + 1;
			++currRow;
		}
		return currRow <= height ? currRow : -1;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void inOrderTraversal(int i, String path, long sum) {
		
		if(i == -1) {
			return;
		}
		if(isLeaf(i)) {
			if(sum + pyramidArray[i] > maxValuePath) {
				maxValuePath = sum + pyramidArray[i];
			}
			//System.out.println(path);
		}
		//System.out.println(i);
		inOrderTraversal(getLeft(i), path + "L ", sum + pyramidArray[i]);
		inOrderTraversal(getRight(i), path + "R ", sum + pyramidArray[i]);
 	}
	
	public boolean isLeaf(int n) {
		return (getLeft(n) == -1 || getRight(n) == -1) ? true : false; 
	}
	
	public long getMaxValuePath() {
		return maxValuePath;
	}
	
	public int getNodeCount() {
		return nodeCount;
	}
	
	public void updateNodeValue(int node, long value) {
		pyramidArray[node] = value;
	}
	
	public long getNodeValue(int i) {
		return pyramidArray[i];
	}
	
	public long[] getPyramid(){
		return pyramidArray;
	}
	

	public static void main(String args[]) {
		/*
		for(int i= 0; i < 20; ++i) {
			System.out.println("Element ID: " + i + " Left: " + Pyramid.getLeft(i));
		}*/
		
	}
	
	
}
