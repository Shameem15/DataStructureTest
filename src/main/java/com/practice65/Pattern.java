package com.practice65;

public class Pattern {
	
	public static void main(String[] args) {
		pattern_array(8);
	}
	
	
	/**
	 * 1
	 * 2 13
	 * 3 12 14
	 * 4 11 15 22
	 * 5 10 16 21 23
	 * 6 9  17 20 24 27
	 * 7 8  18 19 25 26 28
	 */
	private static void pattern_array(int row) {
		int[][] array = new int[row][row];
		int num = 1;
		int dynamicRow = row;
		int oddNum = 0;
		for (int i = 0; i < row; i++) {
			dynamicRow--;
			oddNum = num + dynamicRow;
			for (int j = 0; j < row; j++) {
					if (j >= i) {
						if (i % 2 == 0) {
							array[j][i] = num;
							num++;
						}
						else {
							array[j][i] = oddNum;
							oddNum--;
							num++;
						}
					}
			}
			
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i >= j) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}
}
