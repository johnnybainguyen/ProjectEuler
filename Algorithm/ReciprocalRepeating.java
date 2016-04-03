package Algorithm;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


// Lesson Learned - In-place manipulation is always better than moving data around and calculating a problem
// have to be able to weigh the downside and upsides when using a string substring versus a crap ton of calculations with a bigdecimal class dividing by 10^n and multiplying by^10
public class ReciprocalRepeating {
	private int denominator;
	private String reciprocalString;
	private String strippedString;
	public final static int PRECISION = 100;
	public final static int THRESHOLD = 30;
	public final static int WHOLE_DOT = 2;
	public String theString;
	
	public ReciprocalRepeating(int n) {
		reciprocalString = BigDecimal.ONE.divide(new BigDecimal(n), new MathContext(PRECISION * THRESHOLD)).toString();
		strippedString = reciprocalString.substring(2, reciprocalString.length());
		denominator = n;
		theString = "";
	}
	

	public String scanThroughString(int start, int lengthTest) {
		String foundString = "";
		boolean solutionFound = false;

		String firstPattern = strippedString.substring(start, start + lengthTest);
		String secondPattern = strippedString.substring(start + lengthTest, start + lengthTest + lengthTest);
		String thirdPattern = strippedString.substring(start + lengthTest + lengthTest, start + lengthTest + lengthTest + lengthTest);
		if(firstPattern.compareTo(secondPattern) == 0 && thirdPattern.compareTo(thirdPattern) == 0) {
			solutionFound = true;
			foundString = strippedString.substring(start, start + lengthTest);
		} 

		return foundString;
	}
	
	public String findRepeatingNumber() {
		
		String foundNumber = "";
		int start = 0;
		if(isTerminating()) {
			foundNumber = reciprocalString;
		} else {
			int skipZeros = ignoreHowManyZeros(strippedString);
			int i = 0;
			int j = 0;
			for(i = 0 + skipZeros; i < 100; ++i) {
				for(j = 2; j < PRECISION * THRESHOLD / 4; ++j) {
					foundNumber = scanThroughString(i, j);
					if(foundNumber.compareTo("") != 0) {
						break;
					}
				}
				if(foundNumber.compareTo("") != 0) {
					break;
				}
			}
			theString = foundNumber;
			foundNumber = reciprocalString.substring(0, WHOLE_DOT + i) + "(" + foundNumber + ")";
			
		}
		
		
		return foundNumber;
	}
	
	public int ignoreHowManyZeros(String s) {
		int counter = 0; 
		while(s.charAt(counter) == '0') {
			++counter;
		}
		return counter;
	}

	public String foundNumberReduction(String foundNumber) {
		return foundNumber.length() == 2
				&& foundNumber.charAt(0) == foundNumber.charAt(1)
				? String.valueOf(foundNumber.charAt(0)) : foundNumber;
	}
	
	public boolean isTerminating() {
		return reciprocalString.length() < PRECISION * THRESHOLD + WHOLE_DOT;
	}

	
}
