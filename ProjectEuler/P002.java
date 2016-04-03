package ProjectEuler;

import java.math.BigInteger;

public class P002 {
	public static void main(String args[]) {
		long first = 1;
		long second = 2;
		long sum = 0;
		while(first < 4000000 || second < 4000000) {
			if(second % 2 == 0) {
				sum += second;
			}
			long temp = first + second;
			first = second;
			second = temp;
		}
		
		System.out.println(sum);
		
	}
}
