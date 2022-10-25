package streamAPI;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {

    public static void main(String[] args) {

        System.out.println("Question 1");
        question1();

        System.out.println("\n\nQuestion 2");
        question2();

        System.out.println("\n\nQuestion 3");
        question3();

        System.out.println("\n\nQuestion 4");
        question4();

        System.out.println("\n\nQuestion 5");
        question5();

        System.out.println("\n\nQuestion 6");
        question6();

        System.out.println("\n\nQuestion 7");
        question7();

        System.out.println("\n\nQuestion 8");
        question8();

        System.out.println("\n\nQuestion 9");
        question9();

        System.out.println("\n\nQuestion 10");
        question10();

    }

    private static List<Employee> data() {
        List<Employee> employeeList = List.of(
                new Employee("Htet Htet", "Yangon", "Electronics", 900000, LocalDate.of(1991, 10, 16)),
                new Employee("Cherry", "Yangon", "Electronics", 820000, LocalDate.of(1994, 8, 14)),
                new Employee("Kyaw Kyaw", "Yangon", "Electronics", 780000, LocalDate.of(1988, 9, 2)),
                new Employee("Aung Aung", "Mandalay", "IT", 600000, LocalDate.of(1995, 1, 11)),
                new Employee("Jeon", "Mandalay", "IT", 600000, LocalDate.of(1997, 9, 1)),
                new Employee("Hsu Hsu", "Pyin Oo Lwin", "IT", 920000, LocalDate.of(1994, 12, 10)),
                new Employee("Aye Aye", "Yangon", "HR", 500000, LocalDate.of(1992, 10, 10)),
                new Employee("Gay Gay", "Taung Gyi", "HR", 400000, LocalDate.of(1996, 5, 12)),
                new Employee("Phway Phway", "Monywa", "HR", 300000, LocalDate.of(1995, 9, 3)),
                new Employee("Ko Ko", "Monywa", "IT", 500000, LocalDate.of(1992, 11, 11))
        );

        return employeeList;
    }

    private static void question1() {
        var emp = data();

        int min = emp.stream().mapToInt(Employee::getSalary).min().getAsInt();

        System.out.println("Minimum salary : " + min);
    }

    private static void question2() {
        var emp = data();

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getBirthday);

        Employee youngestEmp = emp.stream()
                .max(employeeComparator)
                .get();

        System.out.println(youngestEmp);
    }

    private static void question3() {
        var emp = data();

        List<LocalDate> date = emp.stream().map(employee -> employee.getBirthday()).collect(Collectors.toList());

        LocalDate isEqual = LocalDate.of(1995,2,12);
        int count = 0;

        for (LocalDate i : date) {
            if (isEqual.compareTo(i) >= 0)
                count++;
        }

        System.out.println("1995-02-12 is greater than or equal to count : " + count);
    }

    private static void question4() {
        var emp = data();

        int total = emp.stream().mapToInt(Employee::getSalary).sum();

        System.out.println("Total salary : " + total);
    }

    private static void question5() {
        var emp = data();

        emp.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }

    private static void question6() {
        var emp = data();

        double average = emp.stream().filter(u -> u.getDepartment().equals("HR")).mapToDouble(Employee::getSalary).average().getAsDouble();

        System.out.println("Average salary in HR department : " + average);
    }

    private static void question7() {
        var emp = data();

        emp.stream().sorted().limit(1).forEach(System.out::println);
    }

    private static void question8() {
        var emp = data();

        List<String> city = emp.stream().map(e -> e.getCity()).distinct().collect(Collectors.toList());

        for (String i : city) {
            emp.stream().filter(e -> e.getCity().equals(i)).sorted(Comparator.reverseOrder()).limit(1).forEach(e -> System.out.println(e.getCity() + "\t" + e.getSalary()));
        }

    }

    private static void question9() {
        var emp = data();

        List<Integer> salary = emp.stream().map(e -> e.getSalary()).distinct().collect(Collectors.toList());

        for (Integer i : salary) {
            System.out.print(i + " : ");
            emp.stream().filter(e -> e.getSalary() == i).forEach(e -> System.out.print(e.getName() + ",\t"));
            System.out.println();
        }

    }

    private static void question10() {
        var emp = data();

        List<String> department = emp.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());

        for (String i : department) {
            System.out.print(i + " : ");
            emp.stream().filter(e -> e.getDepartment().equals(i)).forEach(e -> System.out.print(e.getName() + ",\t"));
            System.out.println();
        }

    }

}

class Employee implements Comparable<Employee> {
    private String name, city, department;
    private int salary;
    private LocalDate birthday;

    public Employee(String name, String city, String department, int salary, LocalDate birthday) {
        this.name = name;
        this.city = city;
        this.department = department;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Employee aa) {
        return this.salary - aa.getSalary();
    }

    @Override
    public String toString() {
        return "Employee [Name = " + name + ", City = " + city + ", Department = " + department + ", Salary = " + salary + ", Birthday = " + birthday + "]";
    }
}
