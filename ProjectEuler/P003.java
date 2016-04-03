package ProjectEuler;

import java.math.BigInteger;

import Algorithm.BigIntegerPrime;
import Algorithm.Prime;



public class P003 {
	// Largest Prime factor is a factor that is prime that is largest
	public static long getLargestPrimeFactor(BigInteger i) {
		BigInteger sqrt = new BigInteger(String.valueOf((long)Math.sqrt(i.doubleValue())));
		BigInteger max = new BigInteger("0");
		BigInteger start = new BigInteger("2");
		
		while(start.compareTo(sqrt) == -1 || start.compareTo(sqrt) == 0) {
			if(i.mod(start).compareTo(new BigInteger("0")) == 0) {
				BigInteger otherFactor = i.divide(start);
				if(BigIntegerPrime.isBigIntegerPrime(start) && start.compareTo(max) == 1)
					max = start;
				else if(otherFactor.isProbablePrime(1) && otherFactor.compareTo(max) == 1)
					max = otherFactor;
			}
			
			start = start.add(BigInteger.ONE);
			
		}
		return max.longValue();
	}
	
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

	public static void main(String args[]) {
		BigInteger bi = new BigInteger("600851475143");
		
		System.out.println(getLargestPrimeFactor(bi));
		
		
	}
}
