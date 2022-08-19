package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal  implements Sellable  {

	private BigDecimal price;

	public Cow() {
		super("Cow", "moo!");

		BigDecimal bd = BigDecimal.valueOf(1500);
		this.price = new BigDecimal("1500");
	}



}