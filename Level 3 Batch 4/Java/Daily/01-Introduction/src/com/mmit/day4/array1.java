package com.mmit.day4;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {100, 20, 300, 90, 383, 282, 400};
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		
		System.out.println("arr1 == arr2 : " + Arrays.equals(arr1, arr2));
		System.out.println("arr1 == arr3 : " + Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1);
		System.out.println("After sort, arr1 : " + Arrays.toString(arr1));
		
		System.out.println("Containes 90? : " + (Arrays.binarySearch(arr1, 90) < 0 ? "false" : "true"));
		System.out.println("Containes 190? : " + (Arrays.binarySearch(arr1, 190) < 0 ? "false" : "true"));
		
		
		int total = Arrays.stream(arr1).sum();
		int min = Arrays.stream(arr1).min().getAsInt();
		int max = Arrays.stream(arr1).max().getAsInt();
		double avg = Arrays.stream(arr1).average().getAsDouble();
		
		System.out.println("Total : " + total);
		System.out.println("Min value : " + min);
		System.out.println("Max vlaue : " + max);
		System.out.println("Average : " + avg);
		Arrays.fill(arr1, 7);
		System.out.println();
		
		System.out.println("Before calling, arr1 : " + Arrays.toString(arr1));
		changeValue(arr1);
		System.out.println("After calling, arr1 : " + Arrays.toString(arr1));
		
		String data = "Aung Aung";
		System.out.println("Before calling, data : " + data);
		change(data);
		System.out.println("After, data : " + data);
		
//		Song s = new Song();
//		s.name = "Love Yourself";
//		System.out.println("Before, name : " + s.name);
	}
	
	private static void change(String data) {
		data = "Cherry";
	}
	
	private static void changeValue(int[] input) {
		input[1] = 100;
	}
}
