package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// Get user input for length
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		String inputTemp = userInput.nextLine();

		double tempEntered = Double.parseDouble(inputTemp);

		// Get user length type
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?: ");
		String inputTempType = userInput.nextLine();


		double tempResult = 0;

		// Takes users inputs and shows them in one length type and converts to another
		if (inputTempType.equals("F")) {
			tempResult = (tempEntered - 32) / 1.8;
			System.out.print(inputTemp + "F" + " is " + (int) tempResult + "C" );
		}

		if (inputTempType.equals("C")) {
			tempResult = tempEntered * 1.8 + 32;
			System.out.print(inputTemp + "C" + " is " + (int) tempResult + "F" );
		}
		userInput.close();

	}

}
