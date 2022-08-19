package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {

        super(accountHolderName, accountNumber);
    }


    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        if (getBalance() <= -100) {

            return getBalance();
        }

        int balance = getBalance() - amountToWithdraw;

        if (balance > 0) {
            super.withdraw(amountToWithdraw);
        }
        if (balance < 0 && balance > -100) {
            amountToWithdraw = amountToWithdraw + 10;
            super.withdraw(amountToWithdraw);
        }

        return getBalance();

    }

}
