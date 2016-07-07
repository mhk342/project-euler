import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {

	static int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	static int month = 0;
	static int year = 1900;
	static int day = 1;
	
	static void nextMonth() {
		day = day + monthLengths[month];
		
		boolean isCenturyLeapYear = (year % 400 == 0) || !(year % 100 == 0);
		if (month == 1 && year % 4 == 0 && isCenturyLeapYear) {
			day++; 
		}	
		day %= 7;
		
		month++;
		if (month == 12) {
			month = 0;
			year++;
		}
	}
	
	public static void main(String[] args) throws Exception{
		int sundayCount = 0;
		while (year != 2001) {
			if (day == 0) {
				if (year > 1900) 
					sundayCount++;
				System.out.println(month + " " + year);
			}
			nextMonth();
		}
		System.out.println(sundayCount);
	}
	
}
