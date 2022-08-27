package com.mmit.day4;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private static void primary_array() {
		int[][] marks = {
				{100, 30, 90, 40, 50},	
				{90, 90, 80, 70, 100},
				{70, 100, 90, 100, 100},
		};
		
		int row = marks.length;
		
		System.out.println("===== Print with for loop =====");
		for(var r = 0; r < row; r++) {
			for(var c = 0; c < 5; c++) {
				System.out.println(marks[r][c] + "\t");
			}
			System.out.println();
		}

	}
	
}
