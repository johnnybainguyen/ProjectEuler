package ProjectEuler;

import java.util.List;
import java.util.Vector;

public class P044 {

	public static void main(String args[]) {
		int pair1 = 0;
		int pair2 = 0;
		int minimizedD = 0;
		int counter = 1;
		Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		OuterLoop:
		while(pair1 == 0 && pair2 == 0) {
			if(v.size() != 0) {
				int left = 1;
				int right = v.size() - 1;
				while(left < right) {
					int leftContent = v.get(left);
					int rightContent = v.get(right);
					if(isPentagonicNumber(leftContent + rightContent) && isPentagonicNumber(rightContent - leftContent)) {
						pair1 = leftContent;
						pair2 = rightContent;
						break;
					}
					++left;
				}
			}

			v.add(getNextPentagonNumber(counter));
			++counter;


		}
		System.out.println(pair2 - pair1);
	}
	
	public static boolean isPentagonicNumber(int n) {
		double value = (Math.sqrt(24 * n + 1) + 1) / 6;
		return value == (int)value;
	}

	public static  int getNextPentagonNumber(int n) {
		return (n * (3 * n - 1)) / 2; 
	}
}
