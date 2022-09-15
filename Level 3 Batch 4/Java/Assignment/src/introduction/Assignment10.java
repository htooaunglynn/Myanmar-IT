package introduction;

import java.util.Scanner;

public class Assignment10 {

    static String[] region = {"Kachin State", "Kayah State", "Kayin State", "Chin State", "Sagaing Region", "Tanintharyi Region", "Bago Region", "Magway Region", "Mandalay Region", "Mon State", "Rakhine State", "Yangon Region", "Shan State", "Ayeyawady Region", "Nay Pyi Taw"};

    private static void nationalRegistrationCard() {

        int  regionNo = 0;
        String nrc_no = "";
        String[] no = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        System.out.println("What is your NRC.");

        Scanner sc = new Scanner(System.in);
        String nrc = sc.nextLine();
        sc.close();

        String[] searchRegion = nrc.split("/");

        String township = searchRegion[1];
        String[] seaTownship = township.split("()");

        System.out.print("Division/state : ");
        for (int i = 0; i < seaTownship.length; i++) {
            if ("(".equals(seaTownship[i]))
               break;
            else
                System.out.print(seaTownship[i]);
        }

        System.out.println();

        regionNo = Integer.parseInt(searchRegion[0]);
        System.out.println("City : " + region[(--regionNo)]);


        System.out.print("Number : ");
        for (int i = 0; i < seaTownship.length; i++) {
            for (int j = 0; j < no.length; j++) {
                if (no[j].equals(seaTownship[i]))
                    nrc_no += seaTownship[i];
            }
        }

        if (nrc_no.length() > 6)
            throw new ArrayIndexOutOfBoundsException("NRC is invalid.");

        System.out.println(nrc_no);
    }

    public static void main(String[] args) {

        try {
            nationalRegistrationCard();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
