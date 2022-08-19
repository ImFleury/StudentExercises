package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declare and Instantiate

		Map<String, String> nameToZip = new HashMap<>();
		nameToZip.put("David" , "44120");
		nameToZip.put("Dan" , "44124");
		nameToZip.put("Elizabeth" , "44012");

		//nameToZip.put("Elizabeth" , "90210"); (Will always use the most recent entry, so if this was uncommented it would print 90210 over 44012)

		System.out.println("David lives in " + nameToZip.get("David"));
		System.out.println("Dan lives in " + nameToZip.get("Dan"));
		System.out.println("Elizabeth lives in " + nameToZip.get("Elizabeth"));
		System.out.println();

		if (nameToZip.containsKey("Elizabeth")){
			System.out.println("Elizabeth exists!");
		}

		String badData = nameToZip.get("ElizaBeth");
		if (badData == null){
			System.out.println("Elizabeth does not exist!");
		}

		if (!nameToZip.containsKey("Elizabeth")){
			nameToZip.put("Elizabeth" , "99999");
		}

		System.out.println("Elizabeth lives in " + nameToZip.get("Elizabeth"));

		// Number of Elements

		System.out.println("nameToZip contains " + nameToZip.size() + " elements");

		System.out.println("*****************");
		System.out.println("Get Keys");
		System.out.println("*****************");

		// Get Keys

		Set<String> keys = nameToZip.keySet();

		for(String name : keys){
			System.out.println(name + " lives in " + nameToZip.get(name));
		}

		System.out.println();

		System.out.println("***************");
		System.out.println("Entry Set");
		System.out.println("***************");

		for(Map.Entry<String, String> nameAndZip : nameToZip.entrySet()){
			String key = nameAndZip.getKey();
			String value = nameAndZip.getValue();

			System.out.println(key + " is the key And " + value + " is the value");

		}

		System.out.println();

		System.out.println("***************");
		System.out.println("Remove Item");
		System.out.println("***************");

		nameToZip.remove("David");
		for(Map.Entry<String, String> nameAndZip : nameToZip.entrySet()){
			String key = nameAndZip.getKey();
			String value = nameAndZip.getValue();

			System.out.println(key + " is the key And " + value + " is the value");

		}

			System.out.println("***************");

		nameToZip.put("David", "44120");
		nameToZip.put(null, "44120");

		for(Map.Entry<String, String> nameAndZip : nameToZip.entrySet()){
			String key = nameAndZip.getKey();
			String value = nameAndZip.getValue();

			System.out.println(key + " is the key And " + value + " is the value");

		}
		nameToZip.remove(null);

		System.out.println("*****************");
		System.out.println("Sets");
		System.out.println("*****************");

		// Get Keys

/*		Set<String> setOfKeys = nameToZip.keySet();
		setOfKeys.add("Groucho");*/

		System.out.println();

		Set<String> setOfKeys = new HashSet<>();
		for (String name : nameToZip.keySet()){
			setOfKeys.add(name);
		}
		setOfKeys.add("Groucho");

		for(String name : setOfKeys){
			System.out.println(name + " lives in " + nameToZip.get(name));
		}

		System.out.println();


	}

}
