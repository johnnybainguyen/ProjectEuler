package LanguageConcept;

public class StaticBlock {
	static int i = 1111;
	

	// Lesson learned:  calcuations are done left to right
	// sometimes i changes because of increment and decrement
	// it doesn't when using post incrementer
	// Static variables are initialized before the running of main
	
	static {
		System.out.println("Static Print");                                                                                                                                                                                                     
		i = i-- - --i;
	}
	
	{
		System.out.println("Block Print");
	}
	
	
	public static void main(String args[]) {
		System.out.println("Code start");
		StaticBlock sb = new StaticBlock();
		System.out.println("Code end");
		
	}
}
