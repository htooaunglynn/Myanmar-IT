package oop.Assignment2.InheritanceDemo;

public class Teacher extends Person{

    private String position, department;
    private int salary;

    public String getPosition() { return position; }

    public void setPosition(String position) { this.position = position; }

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

    Teacher() {

    }

    public Teacher(String position, String department, int salary) {
        setPosition(position);
        setDepartment(department);
        setSalary(salary);
    }

    public void promote(String newPosition, int newSalary) {
        setPosition(newPosition);
        setSalary(newSalary);
    }

    public void transfer(String newDepartment) {
        setDepartment(newDepartment);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        showIdentificationInfo();
        System.out.println("Position : " + getPosition());
        System.out.println("Department : " + getDepartment());
        System.out.println("Salary : " + getSalary());
        System.out.println();
    }
}
