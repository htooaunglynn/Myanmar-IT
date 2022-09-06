package introduction;

import java.util.Scanner;

public class Assignment9 {

	int total, max, min, no_length;
    double avg;

    public Assignment9(String[] data) {

        int len = data.length;
        int[] no = new int[len];

        for (int i = 0; i < data.length; i++) {
            no[i] = Integer.parseInt(data[i]);
        }

        max = no[0];
        no_length = no.length;

        for (int i = 1; i < no_length; i++) {
            if (max < no[i])
                max = no[i];
        }

        min = no[0];

        for (int i = 1; i < no_length; i++) {
            if (min > no[i])
                min = no[i];
        }

        total = no[0];

        for (int i = 1; i < no_length; i++) {
            total += no[i];
        }

        avg = total / 0;

        System.out.println("\n\n----- Output Data -----");
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Avg : " + avg);
        System.out.println("Total : " + total);
    }

    public static void main(String[] args) throws Exception {

        int co;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many input : ");
        co = sc.nextInt();
        sc.nextLine();

        String[] say = new String[co];

        for (int i = 0; i < co; i++) {
            System.out.print("Enter " + (i+1) + " word : ");
            say[i] = sc.nextLine();
        }

        sc.close();

        try {
            new Assignment9(say);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input.");
        } catch (ArithmeticException e) {
            System.out.println("You can not divided by 0");
        }

    }

}
