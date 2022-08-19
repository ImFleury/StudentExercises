package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.Date;

public class Egg implements Sellable, Perishable{

    private String name;
    private BigDecimal price;
    private Date expirationDate;

    public Egg(){
        name = "Egg";
        this.price = new BigDecimal("0.25");
        this.expirationDate = new Date("06/1/2022");
    }


    public String getName(){
        return this.name;
    }

    public BigDecimal getPrice(){
        return this.price;
    }


    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }
}
