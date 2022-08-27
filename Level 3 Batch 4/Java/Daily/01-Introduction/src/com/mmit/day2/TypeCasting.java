package com.mmit.day2;

public class TypeCasting {	

	public static void main(String[] args) {
		
		int a = 100;
		long b = a ; //implicit casting
		double c = a;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		System.out.println("----------------");
		
		double d = 3.3;
		int e = (int)d; //explicit casting
		
		System.out.println("d: "+ d);
		System.out.println("e: " + e);
	}

}
