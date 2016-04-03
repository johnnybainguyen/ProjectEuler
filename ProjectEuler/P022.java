package ProjectEuler;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

import EnumObject.Alphabet;
import HelperFunction.InputFile;

public class P022 {
	public static void main(String argsp[]) { 
		Vector<String> namesVector = new Vector<String>();
		InputFile iff = new InputFile("C:\\Users\\johnny\\workspace\\AlgorithmJava\\src\\ProjectEuler\\P022.txt");
		String namesList = iff.getVectorString().get(0);
		StringTokenizer st = new StringTokenizer(namesList, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken().replaceAll("\\s", "").replaceAll("\"", "");
			namesVector.add(token);
		}
		Alphabet alphabet = new Alphabet();
		Collections.sort(namesVector);
		
		int totalScore = 0;
		for(int i = 0; i < namesVector.size(); ++i) {
			totalScore += alphabet.getNameScore(namesVector.get(i)) * (i + 1);
		}
		
		System.out.println(totalScore);
	}
}
