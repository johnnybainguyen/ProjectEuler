package ProjectEuler;

public class P014 {
	public static void main(String args[]) {
		long chainCount = 0;
		
		long originalN = 0;
		long max = 0;
		for(long i = 999999; i > 0; --i) {
			long n = i;
			chainCount = 0;
			
			while(n != 1) {
				
				if(n % 2 == 0)
				{
					n /= 2;
					++chainCount;
				}
				else 
				{
					n = 3 * n + 1;
					++chainCount;
				}
			}
			if(chainCount > max) {
				max = chainCount;
				originalN = i;
			}
			
		}
		System.out.println(originalN);
	}

}
