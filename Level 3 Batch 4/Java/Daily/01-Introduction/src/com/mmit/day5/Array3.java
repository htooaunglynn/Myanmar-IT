package com.mmit.day5;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] data = {
				{1,2},
				{1,2,3,4},
				{1,2,3}
		};
		
		for (var i = 0; i < data.length; i++) {
			for (var j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for (int[] row : data) {
			for (var c : row)
				System.out.print(c + "\t");
			
			System.out.println();
		}
	}

}
