package ProjectEuler;

import java.math.BigDecimal;
import java.math.MathContext;

import Algorithm.ReciprocalRepeating;

public class P026 {
	public static void main(String args[]) {
		ReciprocalRepeating rp = null;
		int max = 0;
		String theString = "";
		int pew = 0;
		for(int i = 2; i < 1001; ++i) {
			rp = new ReciprocalRepeating(i);

			System.out.println(i + " " + rp.findRepeatingNumber());
			if(rp.theString.length() > max) {
				max = rp.theString.length();
				theString = rp.theString;
				pew = i;
			}
			System.out.println(i + " " + BigDecimal.ONE.divide(new BigDecimal(i), new MathContext(ReciprocalRepeating.PRECISION * ReciprocalRepeating.THRESHOLD)).toString());
		}
		
		System.out.println(pew + " " + theString + " " + max);
	}
}
