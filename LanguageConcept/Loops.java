package LanguageConcept;

public class Loops {
	public static void main(String args[]) {
		// Lesson learned:  For loop runs the conditions first to check if the i follows the condition
		// then it precedes with the body if it is still true
		// at this point the counter isn't incremented yet
		// when the body finishes running, it goes back up the for loop
		// it increments the counter and then checks the condition to see if it should continue
		// it will continue to do so until the condition is true
		// when it isn't true, the counter has been incremented which makes the final counter value false
		// counter is the last thing the happens besides the checking
		int i; 
		for(i = 0; i < 0; System.out.println("Counter incremented to: " + i)) {
			System.out.println("Running Body Code for: " + i);
			i++;
		}
		System.out.println("Final i value: " + i);
		
		int j;
		for(j = 0; j < 0; ++j) {
			System.out.println("Running Body Code for: " + j);
			int meh = j + 1;
			System.out.println("Counter incremented to: (pretend) " + meh);
		}
		System.out.println("Final i value: " + j);
		
		// Typical while loop that acts like a for loop
		// counter ends with +1 more than expected
		int k = 0; 
		while(k < 0) {
			System.out.println("Running Body Code for: " + k);
			++k;
			System.out.println("Counter incremented at the end of while loop: " + k);
		}
		
		// Lesson Learned Do while loop runs the body code at least once
		int l = 0;
		do {
			System.out.println("Running Body Code for: " + l);
			++l;
			System.out.println("Counter incremented at end of do loop: " + l);
		} while(l < 0);
	}

}
