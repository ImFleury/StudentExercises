package com.techelevator;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }


    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {


        if (amountToWithdraw + 2 > getBalance()) {
            return getBalance();

        }
        if (getBalance() - amountToWithdraw < 150) {
                return super.withdraw(amountToWithdraw + 2);
        }
        return super.withdraw(amountToWithdraw);


        /* another solution
        int remainingBalance = getBalance() - amountToWithdraw;
        if (remainingBalance >= 150) {
            return super.withdraw(amountToWithdraw);
        }
        if (remainingBalance - 2 >= 0) {
            return super.withdraw(amountToWithdraw + 2);
        }
        return getBalance();
        */

    }


}
