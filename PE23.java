import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	static int limit = 28123;
	static boolean abundantNumbers[];
	
	static boolean isAbundant(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum > n;
	}
	
	static boolean isSumOfTwoAbundantNumbers(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (abundantNumbers[i] && abundantNumbers[n - i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		abundantNumbers = new boolean[limit + 1];
		for (int i = 1; i <= limit; i++) {
			abundantNumbers[i] = isAbundant(i);
		}
		long sum = 0;
		for (int i = 1; i <= limit; i++) {
			if (!isSumOfTwoAbundantNumbers(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	

	
}
