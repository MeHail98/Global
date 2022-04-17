package by.itstep.rodionov.javastages.stage13;

import by.itstep.rodionov.javastages.stage13.arrayLogic.LogicTask2;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayLogic2 {

    @Test
    public void testIsSorted() {
        double[] arrayNotSorted = {1,2,3,5,1,8,9};
        double[] arraySortedIncr = {-1,2,3,4,5,90};
        double[] arraySortedDecr = {55,30,10,-5,-20};
        Assert.assertFalse("Fail at not sorted", LogicTask2.checkIsSorted(arrayNotSorted));
        Assert.assertTrue("Fail at sorted increasing", LogicTask2.checkIsSorted(arraySortedIncr));
        Assert.assertTrue("Fail at sorted decreasing", LogicTask2.checkIsSorted(arraySortedDecr));
    }
}