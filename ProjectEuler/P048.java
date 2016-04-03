package ProjectEuler;

import java.math.BigInteger;

public class P048 {
	public static void main(String args[]) 
	{
		BigInteger sum = BigInteger.ZERO;
		for(int i = 1; i <= 1000; ++i) 
		{
			sum = sum.add(new BigInteger(String.valueOf(i)).pow(i));
		}
		BigInteger lastTenDigit = sum.mod(new BigInteger("10").pow(10));
		System.out.println(lastTenDigit.toString());	
	}
}
