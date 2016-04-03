package Algorithm;

public class Fibonacci {

	public int fibR(int n) {
		return (n==0) ? 0 : (n==1) ? 1 : fibR(n-1) + fibR(n-2);
		
	}
	
	// 0 1 2 3 4 5 6 7
	// 0 1 1 2 3 5 8 13
	public int fibS(int n) {
		int first = 0;
		int second = 1;
		for(int i = 0; i < n; ++i) {
			int temp = first + second;
			first = second; 
			second = temp;
		}
		return first;
	}

	public int[] fibArray(int arraySize) {
		int fibList[] = new int[arraySize];
		if(arraySize < 0)
			throw new IllegalArgumentException("Can't have a negative array size!");
		switch(arraySize) {
		case 0:
			break;
		case 1:
			fibList[0] = 0;
		case 2:
			fibList[1] = 1;
		default:
			fibList[0] = 0;
			fibList[1] = 1;
			for(int i = 2; i < arraySize; ++i) {
				fibList[i] = fibList[i-1] + fibList[i-2];
			}
		}
		return fibList;
	}
	
	public static void main(String args[]) {
		Fibonacci f = new Fibonacci();
		for(int i = 0; i < 20; ++i) {
			System.out.println(f.fibR(i));
			System.out.println(f.fibS(i));
		}
		
		int fibArray[] = f.fibArray(1);
		String output = "[";
		for(int i = 0 ; i < fibArray.length; ++i) {
			if(i == fibArray.length-1) {
				output += fibArray[i] + "]";
			} else {
				output += fibArray[i] + ", ";
			}
		}
		System.out.println(output);
		
	}
}
