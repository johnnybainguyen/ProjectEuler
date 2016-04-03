package Algorithm;

import java.util.HashMap;

public class IsomorphicWords {
	private String word1;
	private String word2;
	private HashMap<Character, Character> left;
	private HashMap<Character, Character> right;
	
	private boolean isIsomorphic = false;
	public IsomorphicWords(String word1, String word2) {
		this.word1 = word1;
		this.word2 = word2;
		left = new HashMap<Character, Character>();
		right = new HashMap<Character, Character>();
	}
	
	public boolean isIsomorphic() {
		if(word1 == null || word2 == null) {
			return false;
		}
		
		if(word1.length() != word2.length()) {
			return false;
		}

		if(word1.length() == 0 || word2.length() == 0) {
			return true;
		}
		
		for(int i = 0; i < word1.length(); ++i) {
			left.put(word1.charAt(i),  word2.charAt(i));
			right.put(word2.charAt(i),  word1.charAt(i));
		}
		
		return left.size() == right.size() ? true : false;
	}
}
