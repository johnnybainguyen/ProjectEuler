package Algorithm;

public class StringPermutation {
	private String possibleLetters;
	private String backupPossibleLetters;
	
	public StringPermutation(String possibleLetters) {
		this.possibleLetters = possibleLetters;
		this.backupPossibleLetters = possibleLetters;
	}
	
	public String getCharandRemove(int i) {
		String returnChar = String.valueOf(possibleLetters.charAt(i));
		possibleLetters = possibleLetters.substring(0, i) + possibleLetters.substring(i+1, possibleLetters.length());
		return returnChar;
	}
	
	public String nthPermutation(int i) {
		String generatedNthPermutation = "";
		int n = i - 1;
		Factorial f = new Factorial();
		int currPossPermu = 0;
		int letterGroupSize = 0;
		int foundGroupLocation = 0;
		int posInGroup = 0;
		while(possibleLetters.length() != 1) {
			currPossPermu = f.factorialR(possibleLetters.length());
			letterGroupSize = currPossPermu / possibleLetters.length();
			foundGroupLocation = n / letterGroupSize;
			posInGroup = n % letterGroupSize;
			n = posInGroup;
			generatedNthPermutation += getCharandRemove(foundGroupLocation);
		}
		generatedNthPermutation += getCharandRemove(0);
		reset();
		return generatedNthPermutation;
	}
	
	public void reset() {
		this.possibleLetters = this.backupPossibleLetters;
	}

	public static void main(String args[]) {
		StringPermutation sp = new StringPermutation("012");
		for(int i = 1; i <= 6; ++i) {
			System.out.println(sp.nthPermutation(i));
		}
	}
}
