package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");


		List<String> names = new ArrayList<String>();
		names = AddNameToList ("Frodo", names);
		names = AddNameToList ("Sam", names);
		names = AddNameToList ("Pippin", names);
		names = AddNameToList ("Merry", names);
		names = AddNameToList ("Gandalf", names);
		names = AddNameToList ("Bilbo", names);


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("");

		int i = 0;
		for (String hobbits : names) {
			System.out.println(names.get(i));
			i++;
		}
		System.out.println("");

		while (i < names.size()) {
			System.out.println(names.get(i));
			i++;
		}
		System.out.println("");


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names = AddNameToList ("Sam", names);
		names = AddNameToList ("Sam", names);
		names = AddNameToList ("Sam", names);

		PrintNastyHobbitses(names);


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "David");
		PrintNastyHobbitses(names);


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove( "David");
		PrintNastyHobbitses(names);


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");


		while (names.contains("Sam")) {
			names.remove("Sam");
		}

		PrintNastyHobbitses(names);

		if (names.contains("Gollum")) {
			names.add("Gollum");
		}

		if (!names.contains("Gollum")) {
			names.add ("Gollum");
		}

		PrintNastyHobbitses(names);


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int  indexOfGandalf = names.indexOf("Gandalf");
		System.out.println("Gandalf is at index " + indexOfGandalf);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray(new String[0]);

		for (int j = 0; j < namesArray.length; j++) {
			System.out.println(namesArray[j]);

		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		PrintNastyHobbitses(names);



		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		PrintNastyHobbitses(names);

		String binaryString = "100111";
/*		reverse
				111001
						for (int j = 0; j < binaryString.length(); j++) {
							binaryString.substring(j,j) * 2^j;
						}*/


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(String name : names) {
			System.out.println(name);
		}
	}

	public static void PrintNastyHobbitses(List<String> hobbitList) {
		for (String hobbits : hobbitList) {
			System.out.println(hobbitList);

		}
	}

	public static List<String> AddNameToList(String name, List<String> namesList) {

		if (!namesList.contains(name)) {
			namesList.add(name);
		}

		return namesList;
	}
}
