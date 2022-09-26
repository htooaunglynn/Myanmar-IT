package oop;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        BankAccount bank = new BankAccount("Aung", "1234", "admin", 7894);
        bank.balance = 100000;

        bank.changePassword("4563",sc);

        bank.deposit(100, sc);

        try {
            bank.withdraw(1000);
        }
        catch (Insufficient e) {
            System.err.println(e.getMessage());
        }

        sc.close();
        bank.showInfo();
	}
}

class BankAccount {
    public int accountNo, balance = 1000;
    public String holderName, pinNo, password;

    public BankAccount() {

    }

    public BankAccount(String holderName, String pinNo, String password, int accountNo) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.pinNo = pinNo;
        this.password = password;
    }

    public void changePassword(String newPassword, Scanner sc) {
        System.out.print("Enter your pin number : ");
        String pin = sc.nextLine();

        if(this.pinNo.equals(pin))
            this.password = newPassword;
        else
            System.err.println("Wrong Pin number.");
    }

    public void deposit(int depositAmount, Scanner sc) {
        System.out.print("Enter your interest : ");
        int interest = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter month : ");
        int month = sc.nextInt();
        sc.nextLine();

        int total = depositAmount + (depositAmount * interest * month / 100);
        int result = balance - total;
        this.balance = result;

        if (result > 0) {
            System.out.println("Deposit : " + total);
        } else
            System.err.println("Not enough.");
    }

    public void withdraw(int money) throws Insufficient {
        int result = balance - money;
        balance = result;
        if (result > 0) {
            System.out.println("Withdraw : " + money);
        } else {
            throw new Insufficient("Invalid pin number");
        }
    }

    public void showInfo() {
        System.out.println("Holder Name : " + this.holderName);
        System.out.println("Password : " + this.password);
        System.out.println("Pin Number : " + this.pinNo);
        System.out.println("Account Number : " + this.accountNo);
        System.out.println("Balance : " + balance);
    }

}

class Insufficient extends Exception {
    
	public Insufficient() {

    }
    public Insufficient(String msg) {
        super(msg);
    }
}