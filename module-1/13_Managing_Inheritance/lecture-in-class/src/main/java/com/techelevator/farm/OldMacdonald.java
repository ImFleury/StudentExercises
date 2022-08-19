package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow cow = new Cow();
		cow.sleep(true);
		Pig pig = new Pig();
		pig.sleep(true);


		GrizzlyBear bear = new GrizzlyBear();
 //bear.setFuzzy(true);
bear.getMinimumPrice();
		System.out.println("Grizzlies are fuzzy? " + bear.isFuzzy());
		Chicken chicken = new Chicken();

		Cat cat = new Cat("Cat", "Yeoowww!!!");
		Singable[] singables =
				new Singable[] {cow, chicken, pig, new Tractor(), cat, bear};


		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);

		if (singable instanceof FarmAnimal){
						System.out.println(
								(  (FarmAnimal)singable ).eat());
					}


		System.out.println();
	}
//		System.out.println(cat.eat());
//		System.out.println(cow.eat());
//		System.out.println(pig.eat());
//		System.out.println(chicken.eat());

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}