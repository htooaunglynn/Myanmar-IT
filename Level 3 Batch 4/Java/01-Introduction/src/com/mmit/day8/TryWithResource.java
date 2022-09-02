package com.mmit.day8;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try ( Scanner sc = new Scanner (System.in) ) {
			
			System.out.println("Enter your name : ");
			System.out.println("Name is : " + sc.nextLine() );
			
		} catch (Exception e) {
			
		}
	}

}
