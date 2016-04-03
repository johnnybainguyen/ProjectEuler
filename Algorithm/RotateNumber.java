package Algorithm;

public class RotateNumber {
	private int number;
	public RotateNumber(int n) {
		number = n;
	}
	
	public int rotate() {
		int numberBody = number / 10;
		int rotatePiece = number % 10;
		int numberDigits = (int)Math.log10(number);
		int multiplier = (int)Math.pow(10, numberDigits);
		number = numberBody + rotatePiece * multiplier;
		return number;
	}
	
	public static void main(String args[]) {
		RotateNumber rn = new RotateNumber(2349);
		for(int i = 0; i < 10; ++i) {
			System.out.println(rn.rotate());
		}
	}
}
