package Algorithm;

public class Palindromic {
	public static boolean isPalindromic(String s) {
		int left = 0;
		int right = s.length() - 1;
		boolean isPalindromic = true;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				isPalindromic = false;
			}
			
			++left;
			--right;
		}
		return isPalindromic;
	}
	
	public static void main(String args[]) {
		System.out.println(isPalindromic("100010"));
	}
}
