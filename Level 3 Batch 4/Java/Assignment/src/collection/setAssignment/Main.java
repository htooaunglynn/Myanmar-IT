package collection.setAssignment;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
        HashSet<student> students = new HashSet<>();
        //insert new student
        students.add(new student(3, "Mung"));
        students.add(new student(2, "Lun"));
        students.add(new student(1, "Aung"));

        //sort
        List<student> list = students.stream()
                .sorted(Comparator.comparing(
                        student::getId))
                .collect(Collectors.toList());

        //display
        list.forEach(s -> System.out.println(s.getId() + "\t" + s.getName()));

        //update
        Set<student> ss = new HashSet<>();
        ss.add(new student(4, "May"));
        ss.add(new student(5, "Yandanar"));

        students.addAll(ss);


        //search
        students.forEach(s -> {
            if (4 == s.getId())
                System.out.println("Students has found");
        });


        //delete
        students.forEach(s -> {
            if (3 == s.getId()) {
                delStudent del = new delStudent(s.getId(), s.getName());
                students.remove(del);
            }
        });

    }

}
