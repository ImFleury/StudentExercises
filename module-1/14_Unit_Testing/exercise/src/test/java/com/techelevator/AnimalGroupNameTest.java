package com.techelevator;

import org.junit.Assert;                                     //Arrange
import org.junit.Test;                                       //Act
import org.junit.FixMethodOrder;                             //Assert
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class AnimalGroupNameTest {

    @Test
    public void AnimalGroupName_NullAnimal_ReturnsUnknown(){
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String herdName = animalGroupName.getHerd(null);
        String expectedValue = "unknown";
        Assert.assertEquals(expectedValue, herdName);
    }
}
