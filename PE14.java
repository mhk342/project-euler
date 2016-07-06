import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	public static void main(String[] args) throws Exception{
		int counter = 0; 
		int maxLength = 0;
		int ans = 0;
		
		for (int i = 2; i < 1000000; i++) {
			long j = i;
			
			while (j != 1) {
				if (j % 2 == 0) {
					j /= 2;
					counter++;
				}
				else {
					j = j * 3 + 1;
					counter++;
				}
			}
			
			if (counter > maxLength) {
				ans = i;
				maxLength = counter;
			}
			counter = 0;
		}
		
		System.out.println(ans);
	}
}
