package ProjectEuler;

import java.util.HashSet;
import java.util.Set;

public class P029 {
	public static void main(String args[]) {
		Set<Double> set = new HashSet<Double>();
		for(int i = 2; i <= 100; ++i) {
			for(int j = 2; j <= 100; ++j) {
				set.add(Math.pow(i, j));
			}
		}
		System.out.println(set.size());
	}
}
