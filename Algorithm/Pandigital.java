package Algorithm;

import java.util.ArrayList;

public class Pandigital {
	private boolean panList[];
	private boolean includeZero;
	private int length;
	
	public Pandigital(int numberOfDigits) {
		panList = new boolean[numberOfDigits + 1];
		length = numberOfDigits;
	}
	
	public Pandigital(int numberOfDigits, boolean includeZero) {
		this(numberOfDigits);
		if(includeZero)
			++length;
		this.includeZero = includeZero;
	}
	
	public boolean isPandigital(String s) {
		return isPandigital(Long.valueOf(s));
	}
	
	
	public boolean isPandigital(long num) {
		long numValue = num;
		boolean isPandigital = true;
		int counter = 0;
		
		
		while(numValue != 0) {
			long mod = numValue % 10;
			if(mod >= panList.length || panList[(int)mod] == true) {
				isPandigital = false;
				break;
			} else {
				panList[(int)mod] = true;
			}
			numValue /= 10;
			++counter;
		}
		
		reset();
		
		return isPandigital && counter == length;
	}
	
	public void reset() {
		for(int i = 0; i < panList.length; ++i) {
			panList[i] = false;
		}
	}
	
	public static void main(String args[]) {
		Pandigital p = new Pandigital(7, true);
		System.out.println(p.isPandigital(21435670));
	}
}
