package ProjectEuler;


import java.util.Vector;

import Algorithm.AmicableNumber;

public class P021 {
	public static void main(String args[]) {
		int sum = 0;
		AmicableNumber an = null;
		for(int i = 1; i <= 10000; ++i) {
			an = new AmicableNumber(i);
			
			int amicablePair = an.getAmicablePair();
			if(amicablePair != -1 && i != amicablePair) {


					sum += i;

	
			}
	
		}



		System.out.println(sum);

	}
}
