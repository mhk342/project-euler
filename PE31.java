import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	
	static int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
	
	static int countCombinations(int n) {
		return countCombinations(n, 0);
	}
	
	static int countCombinations(int n, int index) {
		if (n == 0) {
			return 1;
		}
		if (index >= coins.length || n < 0) {
			return 0;
		}
		return countCombinations(n - coins[index], index) + countCombinations(n, index + 1);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(countCombinations(200));
	}
	
}
