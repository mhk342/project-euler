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
	
	public static void main(String[] args) throws Exception{
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		System.out.println(calcSumOfDigits(n.toString()));
	}
	
}
