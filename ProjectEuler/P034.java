package ProjectEuler;

import Algorithm.Factorial;

public class P034 {
	public static void main(String args[]) {
		long startTime=System.currentTimeMillis();
		int finalSum = 0;
		for(int i = 3; i < 100000000; ++i) {
			int sum = 0;
			int tempI = i;
			while(tempI != 0) {
				sum += Factorial.factorialS(tempI % 10);
				tempI /= 10;
			}
			//System.out.println(i + " " + sum);
			if(sum == i) {
				finalSum += sum;
				
			}
		}
		System.out.println(finalSum);
		long endTime=System.currentTimeMillis();
		System.out.println("Running Time is "+(endTime-startTime)+" ms");
	}

}
