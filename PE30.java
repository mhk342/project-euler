import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	static int calculateSumOfFifthPowers(int n) {
		int sum = 0;
		while (n > 0) {
			sum += Math.pow(n % 10, 5);
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		long sum = 0;
		
		// I know that numbers with 7 or more digits cannot be considered because
		// 9^5 * 7 < 9999999
		for (int i = 10; i < 1000000; i++) {
			if (calculateSumOfFifthPowers(i) == i) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
}
