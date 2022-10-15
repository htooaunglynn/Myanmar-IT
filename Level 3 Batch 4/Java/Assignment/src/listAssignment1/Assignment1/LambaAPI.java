package listAssignment1.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambaAPI {
	static int status = 0;

    public static void main(String[] args) {

        String[] name = {"Rimuru", "Dazai", "Luffy", "Shuna", "Luccy", "Zoro", "Sanji", "Nami", "Hancock"};

        List<String> student_name = new ArrayList<>(Arrays.asList(name)) ;

        student_name.forEach(std -> System.out.println(std));

        Collections.sort(student_name);

        System.out.println("After sort : " + student_name);

        student_name.forEach(std -> {
            if (std.contains("Nsue")) {
                System.out.println("Nami is found in " + student_name.indexOf("Nami") + " position");
            } else
                status += 1;
        });

        if (student_name.size() == status)
            System.out.println("Nami is not found");

        if (student_name.contains("Iruma"))
            System.out.println("Iruma is found");
        else
            student_name.add("Iruma");

        student_name.forEach(std -> {
            if (std.startsWith("K") || std.startsWith("k"))
                System.out.println(std);
        });

        student_name.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.endsWith("G") || s.endsWith("g");
            }
        });

        System.out.println("After remove all element that start with 'g' or 'G'" + student_name);

        student_name.clear();
        System.out.println("After clear : " + student_name);
    }

}
