package oop.Assignment2.EncapsulationDemo;

public class Students {
	private int studentID, mark;
    private String name;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students() {

    }

    public Students(String name, int studentID, int mark) {
        setName(name);
        setStudentID(studentID);
        setMark(mark);
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Name : " + getName());
        System.out.println("Student ID : " + getStudentID());
        System.out.println("Mark : " + getMark());
        System.out.println();
    }
}
