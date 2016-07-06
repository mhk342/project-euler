import java.util.*;
import java.io.*;
import java.math.*;
 

public class Main {
	static long[][] map;
	static final int MAP_SIZE = 21;
	
	static long getValue(int x, int y) {
		if (x == 0 && y == 0) {
			return 1;
		}
		else if (x == 0) {
			return map[x][y-1];
		}
		else if (y == 0) {
			return map[x-1][y];
		}
		else {
			return map[x-1][y] + map[x][y-1];
		}
	}
	
	static void fillValues() {
		for (int i = 0; i < MAP_SIZE; i++) {
			for (int j = 0; j < MAP_SIZE; j++) {
				map[i][j] = getValue(i, j);
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		map = new long[MAP_SIZE][MAP_SIZE];
		fillValues();
		System.out.println(map[MAP_SIZE-1][MAP_SIZE-1]);
	}
}
