package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");
		String fileEntered = userInput.nextLine();

		System.out.println("What is the search word you are looking for?");
		String keyWord = userInput.nextLine();

		System.out.println("Should the search be case sensitive?");
		String caseSensitive = userInput.nextLine();

		File dataFile = new File(fileEntered);

		int linenumber = 1;

		try (Scanner fileSearch = new Scanner(dataFile)) {

			if (caseSensitive.equals("Y")){

				while (fileSearch.hasNextLine()) {

					String lineOfOutput = fileSearch.nextLine();

					if (lineOfOutput.contains(keyWord)) {
						System.out.println(linenumber + ") " + lineOfOutput);
					}

					linenumber++;
				}

			}

			if (caseSensitive.equals("N")){

				while (fileSearch.hasNextLine()) {

					String lineOfOutput = fileSearch.nextLine();
					String upperOutput = lineOfOutput.toUpperCase();
					String uppercaseKeyword = keyWord.toUpperCase();

					if (upperOutput.contains(uppercaseKeyword)) {
						System.out.println(linenumber + ") " + lineOfOutput);
					}

					linenumber++;

				}

			}

		}

		catch (FileNotFoundException e) {
			System.err.println("The file does not exist.");

		}

	}

}
