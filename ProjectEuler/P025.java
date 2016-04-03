package ProjectEuler;

import Algorithm.BigFibonacci;
import Algorithm.Fibonacci;

public class P025 {
	public static void main(String args[]) {
		BigFibonacci bf = new BigFibonacci();
		System.out.println(bf.fibContains(1000));
	}
}
