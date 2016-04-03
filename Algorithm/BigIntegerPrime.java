package Algorithm;

import java.math.BigInteger;

public class BigIntegerPrime {

	public static BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		while(b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
			else a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}
	
	public static boolean isBigIntegerPrime(BigInteger i) {
		BigInteger sqrt = sqrt(i);
		BigInteger start = new BigInteger("2");
		if(i.intValue() == 2) {
			return true;
		}
		
		while(start.compareTo(sqrt) == -1 || start.compareTo(sqrt) == 0) {
			if(i.mod(start).compareTo(BigInteger.ZERO) == 0) {
				return false;
			}
			start = start.add(BigInteger.ONE);
		}
		return true;
	}

	public static void main(String args[]) {
		BigIntegerPrime bip = new BigIntegerPrime();
		for(int i = 1; i <= 100; ++i) {
			if(bip.isBigIntegerPrime(new BigInteger(String.valueOf(i)))) {
				System.out.println(i + " is a prime!");
			} else {
				System.out.println(i + " is not a prime!");
			}
		}
	}
}
