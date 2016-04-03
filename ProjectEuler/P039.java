package ProjectEuler;

public class P039 {
	public static void main(String args[]) {
		int max = 0;
		int a = 0;
		int b = 0;
		int c = 0
		for(int i = 1; i < 1000; ++i) {
			for(int j = 0; j < 1000; ++j) {
				for(int k = 0; k < 1000; ++k) {
					if(i + j + k < 1000 
						&& i*i + j*j == k*k
						&& i+j+k > max) {
						max = i+j+k;
					}
				}
			}
		}
		System.out.println(max);
	}
}
