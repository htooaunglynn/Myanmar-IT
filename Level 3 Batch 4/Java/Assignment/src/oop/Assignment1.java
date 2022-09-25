package oop;

import java.util.Scanner;

public class Assignment1 {
	BankAccount bank = new BankAccount();
}

class BankAccount {

    private int accountNo, balance = 1000;
    private String holderName, pinNo, password;

    public int getAccountNo() { return this.accountNo; }

    public void setAccountNo(int accountNo) { this.accountNo = accountNo; }

    public int getBalance() { return this.balance; }

    public void setBalance(int balance) { this.balance = balance; }

    public String getHolderName() { return this.holderName; }

    public void setHolderName(String holderName) { this.holderName = holderName; }

    public String getPinNo() { return this.pinNo; }

    public void setPinNo(String pinNo) { this.pinNo = pinNo; }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    public BankAccount() {

    }

    public BankAccount(String holderName, String pinNo, String password, int accountNo) {
        try{
            setHolderName(holderName);
            setPassword(password);
            setPinNo(pinNo);
            setAccountNo(accountNo);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void changePassword(String newPassword, Scanner sc) {
        System.out.print("Enter your pin number : ");
        String pin = sc.nextLine();

        if(getPinNo().equals(pin))
            setPinNo(newPassword);
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
        int result = getBalance() - total;

        if (result > 0) {
            System.out.println("Deposit : " + total);
            System.out.println("Now Balance : " + result);
        } else
            System.err.println("Not enough.");
    }

    public void withdraw(int money) throws Insufficient {
        int result = getBalance() - money;
        setBalance(result);
        if (result > 0) {
            System.out.println("Withdraw : " + money);
            System.out.println("Now Balance : " + getBalance());
        } else {
            Insufficient in = new Insufficient("Not enough");
            throw in;
        }
    }

    public void showInfo() {
        System.out.println("Holder Name : " + getHolderName());
        System.out.println("Password : " + getPassword());
        System.out.println("Pin Number : " + getPinNo());
        System.out.println("Account Number : " + getAccountNo());
        System.out.println("Balance : " + getBalance());
    }
}

class Insufficient extends Exception {
    public Insufficient() {

    }

    public Insufficient(String msg) {
        System.err.println(msg);
    }
}