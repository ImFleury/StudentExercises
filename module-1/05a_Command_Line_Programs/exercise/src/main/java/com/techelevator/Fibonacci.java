package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String inputNumber = userInput.nextLine();


		int firstNum = 0, secondNum = 1;
		int n = Integer.parseInt(inputNumber);
		//System.out.println("Fibonacci Series till " + n + " terms:");

		if (n <= 0) {
			System.out.println("0, 1 ");
		}

		/*
		if (n == 1) {
			System.out.println("Fibonacci Series till: " + n + " terms: ");
		}
		*/
		boolean firstCycle = true;
		while (firstNum <= n) {
			if (firstCycle == false) {
				System.out.print(", ");
			}
			System.out.print(firstNum);

			int nextTerm = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextTerm;
			firstCycle = false;
		}
		userInput.close();
	}
}

