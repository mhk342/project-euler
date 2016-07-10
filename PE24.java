import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	static int[] getNthPermutation(int[] numbers, int n) {
		for (int i = 0; i < n - 1; i++) {
			numbers = getNextPermutation(numbers);
		}
		return numbers;
	}
	
	static void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}
	
	static int[] getNextPermutation(int[] numbers) {
		int index = getNextIndex(numbers);
		if (index == -1) {
			return null;
		}
		int swapIndex = numbers.length - 1;
		while (numbers[index] >= numbers[swapIndex]) {
			swapIndex--;
		}
		swap(numbers, index++, swapIndex);
		// reverse numbers between the two indices
		swapIndex = numbers.length - 1;
		while (index < swapIndex) {
			swap(numbers, index++, swapIndex--);
		}
		return numbers;
	}

	static int getNextIndex(int[] numbers) {
		for (int i = numbers.length - 2; i >= 0; i--) {
			if (numbers[i] < numbers[i + 1]) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) throws Exception {
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println( Arrays.toString( getNthPermutation( array, 1000000 ) ) );
	}
	
}
