package EnumObject;

public class Alphabet {
	private String alphabet;
	
	public Alphabet() {
		alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	}
	
	public int getAlphabetNumber(char letter) {
		int charNumber = -1;
		for(int i = 0; i < alphabet.length(); ++i) {
			if(letter == alphabet.charAt(i)) {
				charNumber = i + 1;
			}
		}
		
		return charNumber;
	}
	
	public int getNameScore(String name) {
		int sum = 0;
		for(int i = 0; i < name.length(); ++i) {
			sum += getAlphabetNumber(name.charAt(i));
		}
		return sum;
	}
}
