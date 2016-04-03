package ProjectEuler;

import java.util.StringTokenizer;
import java.util.Vector;

import DataStructure.Pyramid;
import HelperFunction.InputFile;

public class P018 {
	public static void main(String args[]) {
		InputFile iff = new InputFile("C:\\Users\\johnny\\workspace\\AlgorithmJava\\src\\ProjectEuler\\P018.txt");
		Vector<String> parsedFile = iff.getVectorString();
		String pyramidString = "";
		int numberOfNodes = 0;
		int numberOfRow = parsedFile.size();
		for(int i = 0; i < parsedFile.size(); ++i) {
			pyramidString += parsedFile.get(i) + " ";
			numberOfNodes += i + 1;
		}
			
		
		int pyramidArray[] = new int[numberOfNodes];

		StringTokenizer st = new StringTokenizer(pyramidString, " ");
		int i = 0;
		while(st.hasMoreTokens()) {
			pyramidArray[i] = Integer.parseInt(st.nextToken());
			++i;
		}
		
		//Pyramid py = new Pyramid(pyramidArray, numberOfRow, numberOfNodes);
		//py.inOrderTraversal(0, "* ", 0);
		//System.out.println(py.getMaxValuePath());
		
	}
}
