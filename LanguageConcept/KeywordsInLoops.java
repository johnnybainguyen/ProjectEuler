package LanguageConcept;

public class KeywordsInLoops {
	// Best time to use breaks
	// break; -breaks out of a loop
		// break by itself exits all loops
		// can use labels to to a semi loop break
	
	// Best time to use continue
	// continue; continues to the next interation
		// can use labels to continue 
	
	// Best time to use return keyword by itself
		// not doable in java
		// in other langauges like javascript, it will return undefined
	
	/*
	public static int testReturn(int n) {
		if(n == 2) {
			return;
		}
		return n;
	}
	*/
	
	// Lesson Learned:  break only breaks inner loop
	public static void main(String args[]) {
		OuterBreak:
		for(int i = 0; i < 5;++i) {
			System.out.println("i" + i);
			InnerBreak:
			for(int j = 0; i < 5; ++j) {
				System.out.println("j" +j);
				if(j == 3)
					continue InnerBreak;
			}
		}
	}

}
