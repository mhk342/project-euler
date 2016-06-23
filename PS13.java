import java.util.*;
import java.io.*;
import java.math.*;
 

public class PS13 {

	static ArrayList<String> strings;
	
	public static void main(String[] args) throws Exception{
		strings = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int numLines = 100;
		int stringLen = 50;
		while(strings.size() < numLines) {
			strings.add(scan.nextLine());
		}
		// won't use BigInteger because that would be cheating
		int[] arr = new int[55];
		for(int i = 0; i < 50; i++) {
			for(String s: strings) {
				arr[i] += Integer.parseInt(s.substring(stringLen -i - 1, stringLen - i));
			}
			if(i == 50) break;
			arr[i+1] = arr[i] / 10;
			arr[i] = arr[i] % 10;
		}
		for(int i: arr) 
			System.out.println(i);	
	}
}
