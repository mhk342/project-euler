import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	static HashMap<Integer, Integer> divisorSum;
	
	static Integer calculateDivisorSum(int n) {
		if (divisorSum.containsKey(n)) return divisorSum.get(n);

		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		divisorSum.put(n, sum);
		return sum;
	}
	
	static boolean isAmicable(int n) {
		int pair = calculateDivisorSum(n);
		return calculateDivisorSum(pair) == n && pair != n;
	}
	
	public static void main(String[] args) throws Exception{
		divisorSum = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (isAmicable(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
	
}
