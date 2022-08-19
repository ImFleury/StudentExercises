package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

/*
    hasMinumumCigars
    haveParty(30, false) → false
    haveParty(40, false) → true

    withinMaxRangeOfCigars
    haveParty(40, true) → true
    haveParty(30, true) → false

    weekend
    haveParty(61, true) = True
    haveParrty(61, false0 = false
*/
/*  arrange
    act
    assert*/

    @Test
    public void CigarPartyTest(){

        int lowerOutOfBoundsCigarCount = 30;
        int inBoundsCigarCount = 40;
        int upperOutOfBoundsCigarCount = 61;
        boolean isWeekend = true;

        CigarParty cigarParty = new CigarParty();

      //  boolean resultLowerBounds = cigarParty.haveParty(lowerOutOfBoundsCigarCount, isWeekend);

        Assert.assertEquals(false, cigarParty.haveParty(lowerOutOfBoundsCigarCount, !isWeekend));
        Assert.assertEquals(true, cigarParty.haveParty(inBoundsCigarCount, !isWeekend));

        Assert.assertEquals(false, cigarParty.haveParty(lowerOutOfBoundsCigarCount, isWeekend));
        Assert.assertEquals(true, cigarParty.haveParty(inBoundsCigarCount, isWeekend));

        Assert.assertEquals(false, cigarParty.haveParty(upperOutOfBoundsCigarCount, !isWeekend));
        Assert.assertEquals(true, cigarParty.haveParty(upperOutOfBoundsCigarCount, isWeekend));
    }

}
