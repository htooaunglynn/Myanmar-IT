package oop.Assignment2.InheritanceDemo;

public class Person {

    static String[] region = {"Kachin State", "Kayah State", "Kayin State", "Chin State", "Sagaing Region", "Tanintharyi Region", "Bago Region", "Magway Region", "Mandalay Region", "Mon State", "Rakhine State", "Yangon Region", "Shan State", "Ayeyawady Region", "Nay Pyi Taw"};
    private String name, nrc_no, address, phone;

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getNrc_no() {
        return nrc_no;
    }

    public void setNrc_no(String nrc_no) {
        this.nrc_no = nrc_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person() {

    }

    public Person(String name, String nrc_no, String address, String phone) {
        setName(name);
        setNrc_no(nrc_no);
        setAddress(address);
        setPhone(phone);
    }

    public void showInfo() {
        System.out.println();
        System.out.println("Name : " + getName());
        System.out.println("NRC no : " + getNrc_no());
        System.out.println("Address : " + getAddress());
        System.out.println("Phone : " + getPhone());
    }

    public void showIdentificationInfo() {
        int  regionNo = 0;
        String nrc = getNrc_no(), nrc_number = "";
        String[] no = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String[] searchRegion = nrc.split("/");

        String township = searchRegion[1];
        String[] seaTownship = township.split("()");

        System.out.print("Division/state : ");
        for (String s : seaTownship) {
            if ("(".equals(s))
                break;
            else
                System.out.print(s);
        }
        System.out.println();

        regionNo = Integer.parseInt(searchRegion[0]);
        System.out.println("City : " + region[(--regionNo)]);

        System.out.print("Number : ");
        for (String s : seaTownship) {
            for (String value : no) {
                if (value.equals(s))
                    nrc_number += s;
            }
        }
        System.out.println(nrc_number);
    }
}
