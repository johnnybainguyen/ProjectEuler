package ProjectEuler;

public class P040 {
	public static void main(String args[]) {
		int start = 1;
		int length = 0;
		int addedLength = (int)Math.log10(start) + 1;
		int numberOfProduct = 0;
		int finalProduct = 1;
		int nthArray[] = {1, 10, 100, 1000, 10000, 100000, 1000000};
		while(numberOfProduct < nthArray.length) {
			addedLength = (int)Math.log10(start) + 1;
			for(int i = 0; i < nthArray.length; ++i) {
				if(nthArray[i] > length && nthArray[i] <= length + addedLength) {
					int position = nthArray[i]  - length - 1;
					finalProduct *= Character.getNumericValue(String.valueOf(start).charAt(position));
					++numberOfProduct;
				}
			}
			length += addedLength;
			++start;	
		}
		System.out.println(finalProduct);
	}
}
