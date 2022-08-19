package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String inputDecimalString = userInput.nextLine();
		String [] decimalValues = inputDecimalString.split(" ");

		for (int i = 0; i < decimalValues.length; i++) {
			int currentDecimal = Integer.parseInt(decimalValues[i]);
			String currentBinary = Integer.toBinaryString(currentDecimal);
			//String currentBinary = convertDecimalToBinary(currentDecimal);
			System.out.println(currentDecimal + " in binary is " + currentBinary);
		}

	}

	/*
	public static String convertDecimalToBinary(int decimalValue) {

		return "";
	}
	*/

}

