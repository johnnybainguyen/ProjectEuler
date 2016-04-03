package Algorithm;

public class AmicableNumber extends Factor{
	
	public AmicableNumber(int n) {
		super(n);
	}
	
	public int getAmicablePair() {
		int amicablePair = -1;
		AmicableNumber testingPair = new AmicableNumber(sum());
		int testSum = testingPair.sum();
		if(testSum == super.getNumber()  && sum() != testingPair.sum())
			amicablePair = testingPair.getNumber();
		return amicablePair;
	}

	public int sum() {
		int intList[] = super.getFactorArray();
		int sum = 0;
		for(int i = 0; i < intList.length; ++i) {
			sum += intList[i];
		}
		return sum;
	}
	
	public int typeOfNumber() {
		int amicablePair = 0;
		int testSum = sum();
		if(testSum == super.getNumber())
			amicablePair = 0;
		else if(testSum < super.getNumber()) 
			amicablePair = -1;
		else
			amicablePair = 1;
		return amicablePair;
	}
	

}
