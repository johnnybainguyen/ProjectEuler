package ProjectEuler;

import DataStructure.Diamond;

public class P015 {
	
	public static void main(String args[]) {
		int midHeight = 21;
		int numberOfNodes = 0;
		for(int i = 1; i <= midHeight; ++i) {
			numberOfNodes += i;
		}
		
		int numberOfNodePyramid = numberOfNodes;
		for(int i = 1; i <= midHeight-1; ++i) {
			numberOfNodes += i;
		}
		
		long diamondArray[] = new long[numberOfNodes];
		diamondArray[0] = 1;
		Diamond d = new Diamond(diamondArray, midHeight, numberOfNodes, numberOfNodePyramid);

		//d.inOrderTraversal(0);
		//d.getNodeValue(numberOfNodes-1);
		d.fillDiamond();
		d.printDiamond();

		
		
	}

}
