package Algorithm;

import java.math.BigInteger;

public class BigFibonacci {
	public BigFibonacci() {
		
	}
	
	public int fibContains(int digits) {
		BigInteger first = BigInteger.ONE;
		BigInteger second = BigInteger.ONE;
		int index = 1;
		while(first.toString().length() < digits) {
			BigInteger temp = first;
			first = second;
			second = temp.add(second);
			++index;;
		}
		return index;
	}
}
