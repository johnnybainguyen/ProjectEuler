package ProjectEuler;

import java.util.Calendar;

public class P019 {
	
	public static void main(String args[]) {
		Calendar c = Calendar.getInstance();
		c.set(1901, 0, 1);

		int numberOfSunday = 0;
		while(c.get(Calendar.YEAR) != 2001) {
			
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				++numberOfSunday;
			
			c.add(Calendar.MONTH, 1);
		}
		System.out.println(numberOfSunday);
	}
	
	
}
