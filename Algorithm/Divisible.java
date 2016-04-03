package Algorithm;

import java.math.BigInteger;
import java.util.Vector;

public class Divisible {
	public static void findAllDivisibleNumber(BigInteger n) {
		BigInteger upperBound = n;
		//Vector<BigInteger> v = new Vector<BigInteger>();
		//v.add(BigInteger.ONE);
		//v.add(n);
		BigInteger test = new BigInteger("2");
		for(BigInteger i = new BigInteger("2"); i.compareTo(n) == -1 && i.compareTo(upperBound) == -1; i = i.add(BigInteger.ONE)) {
			if(n.mod(i).compareTo(BigInteger.ZERO) == 0) {
				//v.add(i);
				//v.add(n.divide(i));
				test = test.add(new BigInteger("2"));
				upperBound = n.divide(i);
				System.out.println(test);
			}
		}
		
	
	}
	
	public static boolean isDivisible(BigInteger n, BigInteger divisor) {
		return n.divide(divisor).multiply(divisor).compareTo(n) == 0 ? true : false;
	}
	
	public static void printAllDivisible(Vector<BigInteger> v) {
		for(int i = 0; i < v.size(); ++i) {
			System.out.println(v.get(i).toString());
		}
		System.out.println(v.size());
	}
	
	public static void main(String args[]) {
		Divisible.findAllDivisibleNumber(new BigInteger("9999"));
	}
}
