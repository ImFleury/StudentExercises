package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print(" Please enter the amount of the bill: ");
		String inputBillAmount = userInput.nextLine();
		double amountOfBill = Double.parseDouble(inputBillAmount);

		System.out.print(" Please enter the amount tendered: ");
		String inputTenderedAmount = userInput.nextLine();
		double amountTendered = Double.parseDouble(inputTenderedAmount);

		if (amountOfBill > amountTendered) {
			System.out.println("Show me the money!!");
		} else {
			double change = amountTendered - amountOfBill;

			System.out.println("The change required is $" + change);

		}

	}
}
