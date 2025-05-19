package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(int accountNumber, String name, double balance) {
        this.accountNumber = String.valueOf(accountNumber);
        this.name = name;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance;
    }
}
