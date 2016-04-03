package ProjectEuler;
import java.math.BigInteger;
import java.util.Vector;

import HelperFunction.InputFile;

public class P013 {
	
	public static void main(String args[]) {
		InputFile inf = new InputFile("C:\\Users\\johnny\\workspace\\AlgorithmJava\\src\\ProjectEuler\\P013.txt");
		Vector<String> list = inf.getVectorString();
		BigInteger sum = BigInteger.ZERO;
		for(int i = 0; i < list.size(); ++i) {
			sum = sum.add(new BigInteger(list.get(i)));
		}
		
		String sumString = sum.toString();
		System.out.println(sumString.substring(0, 10));
	}

}



