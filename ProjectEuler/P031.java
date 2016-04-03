package ProjectEuler;

public class P031 {
	public static void main(String args[]) {
		final int ONE_PENCE = 1;
		final int TWO_PENCE = 2;
		final int FIVE_PENCE = 5;
		final int TEN_PENCE = 10;
		final int TWENTY_PENCE = 20;
		final int FIFTY_PENCE = 50;
		final int ONE_POUND = 100;
		final int TWO_POUND = 200;
		final int TOTAL_SUM = 400;
		int counter = 0;
		int loop = 0;
		for(int a = 0; a <= TOTAL_SUM; a += TWO_POUND) {
			for(int b = 0; b <= TOTAL_SUM && a + b <= TOTAL_SUM; b += ONE_POUND) {
				for(int c = 0; c <= TOTAL_SUM && a + b + c <= TOTAL_SUM; c += FIFTY_PENCE) {
					for(int d = 0; d <= TOTAL_SUM && a + b + c + d <= TOTAL_SUM; d += TWENTY_PENCE) {
						for(int e = 0; e <= TOTAL_SUM && a + b + c + d + e <= TOTAL_SUM; e += TEN_PENCE) {
							for(int f = 0; f <= TOTAL_SUM && a + b + c + d + e + f <= TOTAL_SUM; f += FIVE_PENCE) {
								for(int g = 0; g <= TOTAL_SUM && a + b + c + d + e + f + g <= TOTAL_SUM; g += TWO_PENCE) {
									for(int h = 0; h <= TOTAL_SUM && a + b + c + d + e + f + g + h <= TOTAL_SUM; h += ONE_PENCE) {
										if(a + b + c + d + e + f + g + h == TOTAL_SUM) {
											++counter;
										}
										++loop;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(counter);
		System.out.println(loop);
	}
}
