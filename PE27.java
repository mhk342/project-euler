import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	static HashMap<Integer, Boolean> isPrimeNumber = new HashMap<Integer, Boolean>();
	
	static int longestConsecutivePrimes(int a, int b) {
		for (int n = 0; ; n++) {
			int num = (n * n) + (a * n) + b;
			if (!isPrime(num)) {
				return n;
			}
			n++;
		}
	}
	
	static boolean isPrime(int n) {
		if (isPrimeNumber.containsKey(n)) {
			return isPrimeNumber.get(n);
		}
		if (n < 0) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrimeNumber.put(n, false);
				return false;
			}
		}
		isPrimeNumber.put(n, true);
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		int maxLength = 0;
		int maxProduct = 0;
		for (int i = -999; i < 1000; i++) {
			for (int j = -999; j < 1000; j++) {
				int length = longestConsecutivePrimes(i, j);
				if (length > maxLength) {
					maxLength = length;
					maxProduct = i * j;
				}
			}
		}
		System.out.println(maxProduct);
		
	}
	
}
