package com.techelevator;

//import org.junit.Test;
//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;
//
//import static org.junit.Assert.assertEquals;


import org.junit.Assert;
import org.junit.Test;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {

    @Test
    public void Test1(){
        String expectedResult = "Java";
        String result = "Java";
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void aTest1(){
        String expectedResult = "Java";
        String result = "Java";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void AnimalGroupName_NullAnimal_ReturnsUnknown(){
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        //Act
        String herdName = animalGroupName.getHerd(null);
        String expectedValue = "unknown";

        //Assert
        Assert.assertEquals(expectedValue, herdName);
    }
}
