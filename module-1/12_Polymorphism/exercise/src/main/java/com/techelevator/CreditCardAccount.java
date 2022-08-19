package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private static int debt;

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        debt = 0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public int pay(int amountToPay) {
        return debt -= amountToPay;
    }

    public static int getDebt() {
        return debt;
    }

    public int charge(int amountToCharge) {
        return debt += amountToCharge;
    }

    public int getBalance() {
        return -debt;
    }


}
