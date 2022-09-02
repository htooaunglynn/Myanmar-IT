package com.mmit.day7;

public class StringBufferTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer = new StringBuffer("Java Programming");
		
		System.out.println("Original : " + buffer);
		
		buffer.append(" language");
		System.out.println("After append, buffer : " + buffer);
		
		buffer.insert(5, " is a ");
		System.out.println("After insert, buffer : " + buffer);
		
		buffer.replace(0, 4, " PHP ");
		System.out.println("After replace, buffer : " + buffer);
		
		System.out.println("Location of 'Programming' : " + buffer.indexOf("Programming"));
		
		System.out.println("Substring : " + buffer.substring(4));
	}
	
}
