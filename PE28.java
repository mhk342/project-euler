import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		long sum = 1;
		int increment = 2;
		int n = 1;
		for (int i = 0; i < 1001/2; i++) {
			for (int j = 0; j < 4; j++) {
				n += increment;
				sum += n;
			}
			increment += 2;
		}
		System.out.println(sum);
	}
	
}
