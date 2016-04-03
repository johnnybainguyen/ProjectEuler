package ProjectEuler;

public class P004 {
	public static boolean isPalindromic(long value) {
		String valueString = String.valueOf(value);
		int left = 0;
		int right = valueString.length() - 1;
		while(left < right) {
			if(valueString.charAt(left) != valueString.charAt(right)) {
				return false;
			}
			++left;
			--right;
		}
		return true;
		
	}
	
	public long getLargestPalindromic3DigitProduct() {
		long max = 0;
		for(long i = 999; i >= 100; --i) {
			for(long j = 999; j >= 100; --j) {
				long product = i * j;
				if(product > max && isPalindromic(product)) {
					max = product;
				}
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		P004 p = new P004();
		System.out.println(p.getLargestPalindromic3DigitProduct());

	}
}
