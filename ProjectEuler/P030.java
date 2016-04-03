package ProjectEuler;

import java.util.Vector;

public class P030 {

	public static void main(String args[]) {
		//10000-99999
		final int FIFTH_POWER = 5;
		final int maxNumberDigit = 9;
		int limit = FIFTH_POWER * maxNumberDigit * maxNumberDigit * maxNumberDigit * maxNumberDigit * maxNumberDigit;

		Vector<Integer> sumOfFifthDigit = new Vector<Integer>();
		
		for(int i = 2; i < limit ; ++i) {
			int number = i;
			int sum = 0;
			while(number > 0) {
				int digitPower = number % 10;
				number /= 10;
				int temp = 1;
				for(int j = 0; j < FIFTH_POWER; ++j) {
					temp *= digitPower;
				}
				sum += temp;
			}
			if(sum == i) {
				sumOfFifthDigit.add(i);
			}
		}
		int sum = 0;
		for(int i = 0; i < sumOfFifthDigit.size(); ++i) {
			sum += sumOfFifthDigit.get(i);
			System.out.println(sumOfFifthDigit.get(i));
		}
		
		System.out.println(sum);
		System.out.println(sumOfFifthDigit.size());
		
		
		
	}
}
