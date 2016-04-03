package Play;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DoublePrim {
	public static void main(String args[]) {
		BigDecimal test2 = BigDecimal.ONE;
		test2 = test2.divide(new BigDecimal("3"), new MathContext(100, RoundingMode.HALF_UP));;
		System.out.println(test2.toString());
	}
}
