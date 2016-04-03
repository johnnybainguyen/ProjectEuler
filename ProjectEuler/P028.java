package ProjectEuler;

public class P028 {
	
	public static void main(String args[]) {
		int cubeSize = 1001;
		int currentPos = 1;
		int sum = 1;
		int adder = 2;
		while(adder <= cubeSize) {
			for(int i = 0 ; i < 4; ++i) {
				currentPos += adder;
				sum += currentPos;
			}
			adder += 2;
		}
		System.out.println(sum);
	}
}
