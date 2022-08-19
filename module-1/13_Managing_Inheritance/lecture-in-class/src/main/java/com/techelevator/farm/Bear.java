package com.techelevator.farm;

import java.math.BigDecimal;

public abstract class Bear extends FarmAnimal implements  Sellable {

    public boolean isFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(boolean fuzzy) {
        this.fuzzy = fuzzy;
    }

    protected BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    private BigDecimal minimumPrice;

    private boolean fuzzy;

    public Bear(String name, String sound) {
        super(name, sound);
    }
    @Override
    public BigDecimal getPrice(){
        return  BigDecimal.valueOf(200, 2);
    }
}
