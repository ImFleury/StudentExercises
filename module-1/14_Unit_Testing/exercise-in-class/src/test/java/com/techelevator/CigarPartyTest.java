package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
//    hasMinimumCigars
//    haveParty(30, false) → false
//    haveParty(40, false) → true
//
//    withinMaxRangeOfCigars
//    haveParty(40, true) → true
//    haveParty(30, true) → false

//    weekend
//       haveParty(61, true) → true
//    haveParty(61, false) → false
    @Test
    public void CigarPartTest(){

        //Arrange
        int LowerOutOfBoundsCigarCount = 30;
        int InBoundsCigarCount = 40;
        int UpperOutOfBoundsCigarCount = 61;
        boolean isWeekend = true;

        CigarParty cigarParty = new CigarParty();
        //Act


        //Assert
        Assert.assertEquals(false, cigarParty.haveParty(LowerOutOfBoundsCigarCount, !isWeekend));
        Assert.assertEquals(true, cigarParty.haveParty(InBoundsCigarCount, !isWeekend));

        Assert.assertEquals(false, cigarParty.haveParty(LowerOutOfBoundsCigarCount, !isWeekend));
        Assert.assertEquals(true, cigarParty.haveParty(InBoundsCigarCount, isWeekend));

        Assert.assertEquals(false, cigarParty.haveParty(UpperOutOfBoundsCigarCount, !isWeekend));
        Assert.assertEquals(true, cigarParty.haveParty(UpperOutOfBoundsCigarCount, isWeekend));
    }
}
