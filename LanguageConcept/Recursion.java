package LanguageConcept;

public class Recursion {
	public void callItself() {
		callItself();
	}
	
	// Recursion adds as it is being recursed
	public void callItself(int until, int sum) {
		sum += until;
		if(until == 0) {
			System.out.println(sum);
			return;
		}
		
		callItself(until - 1, sum);
	}
	
	// Recursion adds as it unwinds itself
	public int callItselfRet(int at) {
		if(at == 0) {
			return 1;
		}
		return 1 + callItselfRet(at - 1);
	}
}
