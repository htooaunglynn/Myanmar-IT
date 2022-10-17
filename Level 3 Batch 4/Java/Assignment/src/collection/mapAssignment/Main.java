package collection.mapAssignment;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        //insert
        students.put(1, "Yandanar");
        students.put(2, "Ei Ei");
        students.put(3, "Saw");
        students.put(4, "Yu");

        //sorting
        List<String> ss = new ArrayList<>(students.values());
        Collections.sort(ss);

        //display
        students.forEach((k, v) -> System.out.println(k + "\t" + v));

        //update
        students.put(6, "May");
        students.put(5, "June");

        //search
        students.forEach((k, v) -> {
            if (3 == k) {
                System.out.println("Student found");
            }
        });

        //delete
        students.remove(5);
    }
	
}
