package Algorithm;

public class TruncateNumbers {
	private int truncatedList[];
	private int currentPositionInList;
	private int truncateNumber;
	
	public TruncateNumbers(int n) {
		truncateNumber = n;
		truncatedList = new int[((int)Math.log10(truncateNumber) + 1) * 2 - 1];
		truncatedList[0] = truncateNumber;
		currentPositionInList = 1;
		truncateLeft(truncateNumber);
		truncateRight(truncateNumber);
	}
	
	public void truncateLeft(int n) {
		int tNum = n;
		int divisor = (int)Math.pow(10, (int)Math.log10(n));
		while(tNum % divisor != 0) {
			tNum %= divisor;
			truncatedList[currentPositionInList] = tNum;
			++currentPositionInList;
			divisor /= 10;
		}	
	}
	
	public void truncateRight(int n) {
		int tNum = n;
		while(tNum/10 != 0) {
			tNum /= 10;
			truncatedList[currentPositionInList] = tNum;
			++currentPositionInList;
		}
	}
	
	public int[] getTruncatedList() {
		return truncatedList;
	}
	
	public void printAllTruncatedNumbers() {
		for(int i = 0; i < truncatedList.length; ++i) {
			System.out.println(truncatedList[i]);
		}
	}
	
	public static void main(String args[]) {
		TruncateNumbers tn = new TruncateNumbers(92);
		tn.printAllTruncatedNumbers();

	}
}
