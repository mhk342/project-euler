import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	public static void main(String[] args) throws Exception {
		BigInteger cur = BigInteger.valueOf(1);
		BigInteger prev = BigInteger.valueOf(1);
		long index = 2;
		while(cur.toString().length() < 1000) {
			BigInteger tmp = cur;
			cur = cur.add(prev);
			prev = tmp;
			index++;
		}
		System.out.println(index);
	}
	
}
