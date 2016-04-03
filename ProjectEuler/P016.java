package ProjectEuler;

import java.math.BigInteger;

public class P016 {
	public static void main(String args[]) {
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(1000);
		int sum = 0;
		String stringNum = bi.toString();
		for(int i = 0; i < stringNum.length(); ++i) {
			sum += Character.getNumericValue(stringNum.charAt(i));
		}
		System.out.println(sum);
	}

}
