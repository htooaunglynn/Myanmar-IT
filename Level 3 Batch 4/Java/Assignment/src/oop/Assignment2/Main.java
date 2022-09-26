package oop.Assignment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Students[] students = new Students[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.print("Enter student name : ");
            String name = sc.nextLine();

            System.out.print("Enter student ID : ");
            int id = sc.nextInt();

            System.out.print("Enter student mark : ");
            int mark = sc.nextInt();

            sc.nextLine();

            System.out.println();
            students[i] = new Students(name, id, mark);

        }

        for (int i = 0 ; i < 4 ; i++) {
            students[i].displayInfo();
        }

        System.out.println("Enter search student ID : ");
        int search_id = sc.nextInt();
        sc.nextLine();

        int status = 0;

        for (int i = 0 ; i < 4 ; i++) {
            if (search_id == students[i].getStudentID())
                students[i].displayInfo();
            else
                status++;
        }

        if (status == 4)
            System.out.println("Student ID : " + search_id + " is not found");

        sc.close();

        int max_info = students[0].getMark();

        for (int i = 1 ; i < 4 ; i++) {
            if (max_info < students[i].getMark())
                max_info = students[i].getMark();
        }

        System.out.println("\nMaximum student information.");
        for (int i = 0 ; i < 4 ; i++) {
            if (max_info == students[i].getMark()) {
                students[i].displayInfo();
            }
        }

        int avg = 0;

        for (int i = 0 ; i < 4 ; i++) {
            avg += students[i].getMark();
        }

        System.out.println("Average : " + (avg/4));
    }
}
