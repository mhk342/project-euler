import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	static int calcSumOfDigits(String s) {
		int sum = 0;
		for (int i = 0 ; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		return sum;
	}
	
	static BigInteger factorial(int n) {
		if (n < 1) throw new IllegalArgumentException();
		if (n == 1) return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(factorial(n-1));
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(calcSumOfDigits(factorial(100).toString()));
	}
	
}
