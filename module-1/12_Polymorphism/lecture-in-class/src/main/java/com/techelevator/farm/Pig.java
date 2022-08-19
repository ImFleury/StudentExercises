package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements  Sellable {

    private BigDecimal price;

    public Pig(){
        super("Pig", "oink!");
        this.price = BigDecimal.valueOf(300.00);
    }

    public BigDecimal getPrice(){
        return price;
    }
}
