package ProjectEuler;


public class P017 {
	public static String constructMain(int n) {
		String tens = getDoubleDigit(n);
		String hundreds = getTripleDigit(n);
		String thousands = constructMain2(n, P017Enum.THOUSAND, 1000);
		String millions = constructMain2(n, P017Enum.MILLION, 1000000);
		String billions = constructMain2(n, P017Enum.BILLION, 1000000000);

		return billions
				+ millions
				+ thousands
				+ hundreds 
				+ ((hundreds.compareTo("") == 0 || tens.compareTo("") == 0) ? "" : "AND ") 
				+ tens;
		
	}
	
	public static String constructMain2(int n, String s, int sigs) {
		int processedNumber = n / sigs;
		String tens = getDoubleDigit(processedNumber);
		String hundreds = getTripleDigit(processedNumber);
		return hundreds + tens + (tens.compareTo("") == 0 && hundreds.compareTo("") == 0 ? "" : s  + " ");
		
	}

	public static String getSingleDigit(int n) {
		String string = "";
		switch(n) {
		case 1:
			string = P017Enum.ONE;
			break;
		case 2:
			string = P017Enum.TWO;
			break;
		case 3:
			string = P017Enum.THREE;
			break;
		case 4:
			string = P017Enum.FOUR;
			break;
		case 5:
			string = P017Enum.FIVE;
			break;
		case 6:
			string = P017Enum.SIX;
			break;
		case 7:
			string = P017Enum.SEVEN;
			break;
		case 8:
			string = P017Enum.EIGHT;
			break;
		case 9:
			string = P017Enum.NINE;
			break;
		default:
			string = "";
		}
		
		return string;
	}
	
	public static String getDoubleDigit(int n) {
		String string = "";
		int firstDigit = n % 100 / 10;
		int secondDigit = n % 10;
		if(firstDigit == 0 && secondDigit == 0) {
			
		} else if(firstDigit == 0 && secondDigit > 0) {
			string += getSingleDigit(secondDigit);
		} else if(firstDigit == 1) {
			switch(secondDigit) {
			case 0:
				string += P017Enum.TEN;
				break;
			case 1:
				string += P017Enum.ELEVEN;
				break;
			case 2:
				string += P017Enum.TWELVE;
				break;
			case 3:
				string += P017Enum.THIR + P017Enum.TEEN;
				break;
			case 5:
				string += P017Enum.FIF + P017Enum.TEEN;
				break;
			case 8:
				string += P017Enum.EIGH + P017Enum.TEEN;
				break;
			default:
				string += getSingleDigit(secondDigit) + P017Enum.TEEN;
			}	
		} else {
			switch(firstDigit) {
	
			case 2:
				string += P017Enum.TWEN + P017Enum.TY;
				break;
			case 3:
				string += P017Enum.THIR + P017Enum.TY;
				break;
			case 4:
				string += P017Enum.FOR + P017Enum.TY;
				break;
			case 5:
				string += P017Enum.FIF + P017Enum.TY;
				break;
			case 8:
				string += P017Enum.EIGH + P017Enum.TY;
				break;
			default:
				string += getSingleDigit(firstDigit) + P017Enum.TY;
			}
			
			if(secondDigit > 0) {
				string += "-" + getSingleDigit(secondDigit); 
			}
		}
		

		return (string.compareTo("") == 0) ? "" : string+ " ";
	}
	
	public static String getTripleDigit(int n) {
		int thirdDigit = n % 1000 / 100;
		return thirdDigit != 0 ? getSingleDigit(thirdDigit) 
				+ " " + P017Enum.HUNDRED + " " : "";
	}
	
	
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1; i <= 1000; ++i) {
			sum += P017.constructMain(i).replace(" ", "").replace("-","").length();
		}
		System.out.println(sum);

	}
}
