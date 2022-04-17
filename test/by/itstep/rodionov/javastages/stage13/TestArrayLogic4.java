package by.itstep.rodionov.javastages.stage13;

import by.itstep.rodionov.javastages.stage13.arrayLogic.LogicTask4;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayLogic4 {

    @Test
    public void testIsEqualDifElem() {
        double[] arrayEqualElements = {1,1,1,1,1,1,};
        double[] arrayDifferentElements = {1,2,3,4,5,6,7};
        Assert.assertTrue(LogicTask4.areAllElementsEqual(arrayEqualElements));
        Assert.assertTrue(LogicTask4.areAllElementsDifferent(arrayDifferentElements));
    }
}