package com.techelevator.farm;

import java.math.BigDecimal;

public class GrizzlyBear extends Bear {
    @Override
    public String eat() {
        return "Grizzlies eat what they want.";
    }

    public GrizzlyBear() {
        super("Grizzly Bear", "growls");
    }

    private BigDecimal x = super.getMinimumPrice();
//    @Override
//    public BigDecimal getPrice() {
//        return new BigDecimal("10000");
//    }
//}
}
