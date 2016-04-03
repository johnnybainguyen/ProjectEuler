package ProjectEuler;

import Algorithm.Palindromic;

public class P036 {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1; i < 1000000; ++i) {
			if(Palindromic.isPalindromic(String.valueOf(i)) 
					&& Palindromic.isPalindromic(Integer.toString(i, 2))) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	

}
