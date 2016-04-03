package Play;

public class StringFunctions {

	private String string;
	
	public StringFunctions(String s) {
		this.string = s;
	}
	
	// Lesson learned - when using substring always use the string length as the end.  -1 is not required as it cuts off before the index provided
	// Index 5 will not have the letter string[5]
	public String substring(int start, int end) {
		return string.substring(start, end);
	}
	
	public String substring(int start) {
		
		return string.substring(start, string.length());
	}
	
	public String otherSubstring(int start) {
		return string.substring(start);
	}
	
	public void printOutStringLetterByLetter() {
		for(int i = 0; i < string.length(); ++i) {
			System.out.println(string.charAt(i));
		}
	}
	
	public boolean isEqual(String s) {
		return string.equals(s);
	}
	
	public String getOddString() {
		String newString = "";
		for(int i = 0 ; i < string.length(); ++i) {
			if(i%2==1) {
				newString += string.charAt(i);
			}
		}
		return newString;
	}
	
	public String removeAll(String s) {
		return string.replaceAll(s, "");
	}
	
	// Lesson learned - Did not think about the input 
	// Did not think about the constraints
	// 	- So the goal is to remove the second character
	//  -  What would be the constraints?
	//  - Second not found?  What to do? Do nothing because second already removed
	//  - if string is initially empty?  Do nothing.  Second already removed
	//  - How do I exit an loop early?  Look up continue
	public String removeSecond(char s) {
		String foundString = "";
		int counter = 0; 
		int secondLocation = -1;
		for(int i = 0; i < string.length() && counter != 2; ++i) {
			if(string.charAt(i) == s) {
				++counter;
				if(counter == 2) {
					secondLocation = i;
					foundString = string.substring(0, i) + string.substring(i+1, string.length());
					continue;
				}
			}
		}
		return foundString;
	}
	
	// if invalid string - I can return the original string unchanged
	public String removeIth(char s, int ith) {
		String newString = "";
		int counter = 0; 
		
		for(int i = 0; i < string.length() && counter != ith; ++i) {
			if(string.charAt(i) == s) {
				++counter;
				if(counter == ith) {
					newString = string.substring(0, i) + string.substring(i+1, string.length());
				}
			}
		}
		
		return newString == "" ? string : newString;
	}
	
	public static void main(String []args) {
		String myString = "a";
		StringFunctions sf = new StringFunctions(myString);
		final int START = 0;
		final int END = myString.length();
		final int MID_VALUE = 0;
		System.out.println(myString.length());
		System.out.println(sf.substring(MID_VALUE));
		System.out.println(sf.substring(START, END));
		System.out.println(sf.otherSubstring(MID_VALUE));
		sf.printOutStringLetterByLetter();
		System.out.println(sf.isEqual("Another String"));
		System.out.println(sf.getOddString());
		System.out.println(sf.removeAll("n"));
		System.out.println(sf.removeSecond('y'));
		System.out.println("-----");
		System.out.println(sf.removeIth('y', 0));
		
	}
}
