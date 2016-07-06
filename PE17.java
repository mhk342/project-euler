import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	static final String[] ONES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
	        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	// without spaces
	static String getEnglishOfNumber(int n) {
		if (n < 0 || n > 1000) {
			return null;
		}
		if (n < 20) {
			return ONES[n];
		}
		if(n < 100) {
			return (n % 10 == 0) ? TENS[n / 10] : TENS[n / 10] + ONES[n % 10];
		}
		if(n < 1000) {
			String end = (n % 100 == 0) ? "" : "and" + getEnglishOfNumber(n % 100);
			return ONES[n / 100] + "hundred" + end;
		}
		return "onethousand";
	}
	
	public static void main(String[] args) throws Exception{
		long sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += getEnglishOfNumber(i).length();
		}
		System.out.println(sum);
	}
	
}
