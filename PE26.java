import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	// calculate decimal cycle length by evaluating remainder at each digit
	static int calculateCycleLength(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int remainder = 1;
		int iteration = 0;
		while (!hm.containsKey(remainder)) {
			hm.put(remainder, iteration);
			remainder = remainder * 10 % n;
			iteration++;
		}
		return iteration - hm.get(remainder);
	}
	
	public static void main(String[] args) throws Exception {
		int maxLength = 0;
		int maxCycle = 0;
		for (int i = 1; i < 1000; i++) {
			int length = calculateCycleLength(i); 
			if (length > maxLength) {
				maxLength = length;
				maxCycle = i;
			}
		}
		
		System.out.println(maxCycle);
	}
	
}
