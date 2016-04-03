package Algorithm;

public class SievesOfEratosthenes {
	private boolean isComposite[];
	private int upperBound;
	
	public SievesOfEratosthenes(int upperBound) {
		this.upperBound = upperBound;
		int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
		isComposite = new boolean[upperBound +1];
		for(int m = 2; m <= upperBoundSquareRoot; m++) {
			if(!isComposite[m]) {
				//System.out.println(m + " ");
				for(int k = m * m; k <= upperBound; k+=m) {
					isComposite[k] = true;
				}
			}
		}
		
		isComposite[0] = true;
		isComposite[1] = true;
	}
	
	public boolean[] getPrimeCheckList() {
		return isComposite;
	}
	
	public void printAllPrimes() {
		for(int m = 2; m <= upperBound; ++m) {
			if(!isComposite[m]) {
				System.out.println(m + " ");
			}
		}
	}
	
	public boolean isPrime(int n) {
		return !isComposite[n];
	}
	
	public static void main(String args[]) {
		SievesOfEratosthenes s = new SievesOfEratosthenes(100);
		s.printAllPrimes();
	}
}
