import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	// returns whether a string contains digits 1 through 9
	static boolean isPandigital(String s) {
		if (s.length() != 9) {
			return false;
		}
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return  String.valueOf(arr).equals("123456789");
	}
	
	
	public static void main(String[] args) throws Exception {
		long sum = 0;
		for (int i = 0; i < 10000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					if (isPandigital("" + i + j + (i / j))) {
						sum += i;
						j = i; // beak out of j for loop
					}
				}
			}
			
		}
		System.out.println(sum);
	}
	
}
