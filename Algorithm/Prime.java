package Algorithm;

public class Prime{
	private long number;
	
	public Prime() {
	}
	
	// This will go from 2:n
	// Is it efficient?  Does it have to go all the way?
	// Example 91: are checks between 45:90 necessary to check if it is prime?  
	public boolean isPrimeA(long n) {
		if(n == 2) {
			return true;
		}
		
		int i = 2;
		
		while(i < n) {
			if(n % i == 0) {
				return false;
			}
			++i;
		}
		
		return true;
	}
	
	// Solution to A: half the n value to do 2:n/2
	public boolean isPrimeB(long n) {
		if(n==2) {
			return true;
		}
		
		int i = 2;
		
		while(i <= n/2) {
			if(n % i== 0) {
				return false;
			}
			++i;
		}
		return true;
	}
	
	// sqrt(81) = 9
	// sqrt(100) = 10
	// sqrt(90) 9.5
	// Assume n = not prime
	// n = a + b  (assumed a = b)
	// if n > a OR B - A goes up and B goes down or vice versa
	//  9 * 9 = 81 (a = 9, b =  9)
	// 3 * 27 = 81 (a = 3, b = 27
	// as long as we get either a or b that is 1-9, we're good
	// the 3 case covers the 37 case
	// THEREFORE we only need to go from 2:n
	public boolean isPrimeC(long n) {
		if(n==2) {
			return true;
		}
		
		int i = 2;
		
		while(i <= Math.sqrt(n)) {
			if(n%i==0) {
				return false;
			} 
			++i;
		}
		
		return true;
	}
	
	
	public static boolean isPrimeInt(int n) {
		if(n==2) {
			return true;
		}
		
		int i = 2;
		
		while(i <= Math.sqrt(n)) {
			if(n%i==0) {
				return false;
			} 
			++i;
		}
		
		return true;
	}

	
	public void printPrimeResults(long n, char letter) {
		boolean isPrime = false;
		switch(letter) {
		case 'a':
			isPrime = this.isPrimeA(n);
			break;
		case 'b':
			isPrime = this.isPrimeB(n);
			break;
		case 'c':
			isPrime = this.isPrimeC(n);
			break;
			default:
				;
		}
		
		if(isPrime) {
			System.out.println("Number: " + n + " is a prime");
		} else {
			System.out.println("Number: " + n + " is not a prime");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Prime Code");
		Prime p = new Prime();
		p.printPrimeResults(2, 'b');
		p.printPrimeResults(3, 'b');
		p.printPrimeResults(4, 'b');
		p.printPrimeResults(5, 'b');
		p.printPrimeResults(6, 'b');
		p.printPrimeResults(7, 'b');
		p.printPrimeResults(8, 'b');
	}
}
