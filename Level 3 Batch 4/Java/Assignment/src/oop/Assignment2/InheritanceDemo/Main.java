package oop.Assignment2.InheritanceDemo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        teacher.setName(sc.nextLine());

        System.out.print("Enter NRC : ");
        teacher.setNrc_no(sc.nextLine());

        System.out.print("Enter address : ");
        teacher.setAddress(sc.nextLine());

        System.out.print("Enter phone : ");
        teacher.setPhone(sc.nextLine());

        System.out.print("Enter position : ");
        teacher.setPosition(sc.nextLine());

        System.out.print("Enter department : ");
        teacher.setDepartment(sc.nextLine());

        System.out.print("Enter salary : ");
        teacher.setSalary(sc.nextInt());
        sc.nextLine();
        sc.close();

        teacher.promote("New Position", 1000000);

        teacher.transfer("New Department");

        teacher.showInfo();
    }
}
