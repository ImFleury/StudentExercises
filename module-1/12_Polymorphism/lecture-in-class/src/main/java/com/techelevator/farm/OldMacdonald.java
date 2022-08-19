package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken(), new Pig(), new Tractor(), new Hamburglar()};

//		for (Singable animal : farmAnimals) {
//			String name = animal.getName();
//			String sound = animal.getSound();
//			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
//			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
//			System.out.println("With a " + sound + " " + sound + " here");
//			System.out.println("And a " + sound + " " + sound + " there");
//			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
//			System.out.println();
//		}

		System.out.println("");
		System.out.println("");


		Sellable[] sellables = new Sellable[]{new Cow(), new Pig(), new Egg()};

//		for (Sellable sellable : sellables) {
//			System.out.println("We have a " + sellable.getName() + " for sale");
//			System.out.println("Only $" + sellable.getPrice());
//
//			if (sellable instanceof Perishable){
//				System.out.println("Only valid until " + ((Perishable) sellable).getExpirationDate());
//			}
//
//			System.out.println("");
//		}

		printTheThing(new Cow());

		// other code

		printTheThing(new Pig());


	}

	public static void printTheThing(Sellable thingToPring){

		System.out.println("We have a " + thingToPring.getName() + " for sale");
		System.out.println("Only $" + thingToPring.getPrice());

		if (thingToPring instanceof Perishable){
			System.out.println("Only valid until " + ((Perishable) thingToPring).getExpirationDate());
		}

		System.out.println("");

	}
}