package day10;

public class Employee {
	
	static int noOfemployee = 3;
	static int nextId = 1;
	final int empId;
	String name;
	int salary;

}

class AppException extends Exception {
	
	public AppException (String msg) {
		super(msg);
	}
}