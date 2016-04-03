package ProjectEuler;

import java.util.StringTokenizer;
import java.util.Vector;
import DataStructure.TriangleNumber;
import HelperFunction.InputFile;

public class P042 {
	public static void main(String args[]) {
		Vector<String> triangleWordVector = new Vector<String>();
		InputFile iff = new InputFile("C:\\Users\\johnny\\workspace\\AlgorithmJava\\src\\ProjectEuler\\P042.txt");
		String namesList = iff.getVectorString().get(0);
		StringTokenizer st = new StringTokenizer(namesList, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken().replaceAll("\\s", "").replaceAll("\"", "");
			triangleWordVector.add(token);

		}
		TriangleNumber tn = new TriangleNumber(26);
		int triangleWordCounter = 0;
		
		for(int i = 0; i < triangleWordVector.size(); ++i) {
			int wordValue = tn.getWordValue(triangleWordVector.get(i));
			if(tn.isTriangleNumber(wordValue)) {
				++triangleWordCounter;
			}
		}
		
		tn.printAllTriangleNumber();
		System.out.println(triangleWordCounter);

	}
}
