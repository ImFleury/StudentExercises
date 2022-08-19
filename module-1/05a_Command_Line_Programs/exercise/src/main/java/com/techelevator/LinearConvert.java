package com.techelevator;

import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		// Get user input for length
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		String inputLength = userInput.nextLine();

		double lengthEntered = Double.parseDouble(inputLength);

		// Get user length type
		System.out.print("Enter if length is Feet or Meters: ");
		String inputLengthType = userInput.nextLine();
		//System.out.println(inputLengthType);

		double lengthResult = 0;

		// Takes users inputs and shows them in one length type and converts to another
		if (inputLengthType.equals("f")) {
			lengthResult = lengthEntered * 0.3048;
			System.out.print(inputLength + "f" + " is " + (int) lengthResult + "m" );
		}

		if (inputLengthType.equals("m")) {
			lengthResult = lengthEntered * 3.2808399;
			System.out.print(inputLength + "m" + " is " +  (int) lengthResult + "f" );
		}

		userInput.close();

	}

}
