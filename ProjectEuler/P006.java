package ProjectEuler;

public class P006 {
	public static void main(String args[]) {
		long squaredSum = 0;
		long sum = 0;
		
		for(int i = 1; i <= 100; ++i) {
			squaredSum += i * i;
			sum += i;
		}
		
		long sumSquared = sum * sum;
		System.out.println(sumSquared - squaredSum);
	}
}
