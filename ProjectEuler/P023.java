package ProjectEuler;

import java.util.Vector;

import Algorithm.AmicableNumber;
import Algorithm.Factor;


// Lesson Learned - problem understanding because I'm overcomplicating it - it should be simple
// 	Assumptions are wrong
//	Overthinking the problem
//	Thinking I need something I dont need
//  So for this problem:
//		- I understood what a perfect number is
//		- I understood sum of divisors
//		- I understood what a deficient number means - sum of divisor is less than n
//		- I understood what a abundant number - sum of divisor is greater than n
//		- I understood what sum of abundant numbers means
// 			- This told me I needed to general all the abundant numbers from 1-28123
//		-  I got confused with mathematical analysis but I understood the bounds that I didn't have to deal with numbers above 28123 and the sum of it
//		-  I know that I cant use any numbers above 28123
// 		- I was confused about if I add the two abundant sum - does the abundant sum have to be abudant too to be valid?  I made this up and took out outside information
//			- STICK TO THE WORDS OF THE PROBLEM
// 		- Your opinion doesn't matter - You just need to do it with the list of rules given
//			- You can make notes on the side and try to break down a description to make sure you understand it
//
//		- If your process was good enough - this is what should've gone through your mind:
// 			- Focus on the what it want in terms of the output
//				- When you see the statement of what it wants, block out all of the background information and imagine the possible values
//				- Find the sum of all positive integers which should mean i > 0
//				- Next piece of information that you should've added in is the limit so now i > 0 && i < 28123
// 				- All numbers that are abundant cannot cannot be in the sum * THIS IS BAD ASSUMPTIO NTHAT YOU MADE UP*  
//					Problem did not say this was true - even though it was a close guess it threw you in confusion


// 			- Breaking down "Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers."
//				- Sum of all possible integers - so sum of all the answers... so what is the answer?
//				- The answer is anything that isn't a sum of two abundant numbers
//				- So we sum all those numbers up - so we can just use a boolean list and use index as the numbers checklist from 0 - 28123


//
//		Things to work out:  
//			-  Your thinking too hard about what the right perfect structure
//			- Think of the most basic fundamentals - can I just use arrays and primitive types
// 			-  When do I need special data structures?
//			-  What is the best way to organize the code given the situation obstacle in front of me
// 			-  Try something different to get better at something
//			-  Too focused on the part that you dont understand that you ignore what they are looking for BAD HABIT
// 			-  You dont need to know everything to figure out the answer!  Work with what you got and do it to the best of your ability
//			- You can do research about the contents but not the answer

public class P023 {
	public static void main(String args[]) {
		int max = 0;
		Vector<Integer> amicableVector = new Vector<Integer>();
		AmicableNumber n = null;
		for(int i = 1; i <= 28123; ++i) {
			n = new AmicableNumber(i);
			if(n.typeOfNumber() == 1) {
				amicableVector.add(i);
			}
		}

		boolean sumOfAbun[] = new boolean[28123+1];

		for(int i = 0 ; i < amicableVector.size(); ++i) {
			for(int j = 0; j < amicableVector.size(); ++j) {
				int amiSum = amicableVector.get(i) + amicableVector.get(j);
				if(amiSum <= 28123) {
					sumOfAbun[amiSum] = true;
				}

			}
		}
		int sum = 0;
		for(int i = 1; i < sumOfAbun.length; ++i) {
			if(!sumOfAbun[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
		// input list of all abundant numbers from one to 28123
		// input 2 boolean array telling me which cannot be used and which cant be used among the sum
		// goal to crossreference the sum numbers and the number of abudant number
		// so what we need to do is check for element of amicableVector and check that index to see if it is false
		// therefore showing that the sum of abunbant doesn't have to be abudant
		for(int i = 0; i < amicableVector.size(); ++i) {
			if(sumOfAbun[amicableVector.get(i)] == false) {
				System.out.println(amicableVector.get(i) + " is an abundant number but is not one of the sums of abun!");
			}
		}
		
		System.out.println(sumOfAbun[12] + " " + sumOfAbun[18] + " " + sumOfAbun[20] + " " + sumOfAbun[945] + " " + sumOfAbun[24]);
		// simple answer 12 isn't a sum 
	}
	



}
