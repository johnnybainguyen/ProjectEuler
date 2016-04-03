package ProjectEuler;

import java.math.BigInteger;

// Lesson Learned:  When converting char string to int, use numericValue()
public class P020 {
	public static BigInteger factorial(BigInteger i) {
		if(i.compareTo(BigInteger.ONE) == 0) {
			return BigInteger.ONE;
		}
		
		return i.multiply(factorial(i.subtract(BigInteger.ONE)));
	}
	public static void main(String args[]) {
		BigInteger bi = new BigInteger("100");
		String factorialResultString = factorial(bi).toString();
		int sumResult = 0;
		for(int i = 0; i < factorialResultString.length(); ++i) {
			sumResult += Character.getNumericValue(factorialResultString.charAt(i));
			
		}
		System.out.println(sumResult);
	}
	
	
}
