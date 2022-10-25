package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.Double;

public class Assignment1 {
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
    }

    private static void question1() {

        List<Salespeople> salespeople = data();

        System.out.println("Name\tCity");
        System.out.println("-----------");

        salespeople.stream()
                .filter(u -> u.getComm() > 0.10)
                .filter(s -> s.getCity().equals("London"))
                .forEach(u -> {
                    System.out.print(u.getName() + "\t");
                    System.out.println(u.getCity());
                });

    }

    private static void question2() {
            var salePeople = data();

        System.out.println("Name\tCity\tComm");
        System.out.println("----------------------");

        salePeople.stream()
                .filter(s -> s.getComm() != 0.10 && s.getComm() != 0.13 && s.getComm() != 0.15)
                .forEach(u -> {
                    System.out.print(u.getName() + "\t");
                    System.out.print(u.getCity() + "\t");
                    System.out.println(u.getComm());
                });
    }

    private static void question3() {
        var salePeople = data();

        List<String> differentCity = salePeople.stream()
                .map(s -> s.getCity())
                .distinct().collect(Collectors.toList());

        System.out.println("City : " + differentCity);
    }

    private static void question4() {
        var salePeople = data();

        System.out.println("Name\tCity\tComm");
        System.out.println("----------------------");

        salePeople.stream()
                .limit(3)
                .forEach(u -> {
                    System.out.print(u.getName() + "\t");
                    System.out.print(u.getCity() + "\t");
                    System.out.println(u.getComm());
                });
    }

    private static void question5() {
        var salePeople = data();

        System.out.println("Name\tCity\tComm");
        System.out.println("----------------------");

        salePeople.stream()
                .filter(u -> u.getCity().equals("Rome"))
                .forEach(u -> {
                    System.out.print(u.getName() + "\t");
                    System.out.print(u.getCity() + "\t");
                    System.out.println(u.getComm());
                });
    }

    private static void question6() {
        var salePeople = data();

        long count = salePeople.stream().filter(s -> s.getCity().equals("London")).count();

        System.out.println("The number of sales people :" + count);
    }

    private static void question7() {
        var salePeople = data();

        System.out.println("Name\tCity\tComm");
        System.out.println("----------------------");

        List<Double> sa = new ArrayList<>();

        salePeople.forEach(u -> sa.add(u.getComm()));

        sa.sort(Comparator.reverseOrder());

        sa.forEach(s -> {
            salePeople.forEach(u -> {
                if (u.getComm() == s) {
                    System.out.print(u.getName() + "\t");
                    System.out.print(u.getCity() + "\t");
                    System.out.println(u.getComm());
                }
            });
        });
    }

    public static List<Salespeople> data() {

        List<Salespeople> salespeopleList = List.of(
                new Salespeople("Peel", "London", 0.12),
                new Salespeople("Serres", "San Jose", 0.13),
                new Salespeople("Motika", "London", 0.11),
                new Salespeople("Rifkin", "Barcelona", 0.15),
                new Salespeople("Axelrod", "New York", 0.10)
        );

        return salespeopleList;
    }
}

class Salespeople {
    private String name, city;
    private double comm;

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

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public Salespeople() {
    }

    public Salespeople(String name, String city, double comm) {
        this.name = name;
        this.city = city;
        this.comm = comm;
    }

}
