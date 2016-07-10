import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	static Set<BigInteger> set = new HashSet<BigInteger>();
	
	public static void main(String[] args) throws Exception {
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				set.add( BigInteger.valueOf(i).pow(j) );
			}
		}
		System.out.println(set.size());
	}
	
}
